package org.lubna.jdbc;

import java.sql.*;
import java.time.LocalDate;

public class JDBC_Examples {

    public static void main(String[] args) {
        ex5();
    }

    public static void ex1() {
        String query = "select * from tasks";
        try (
                Connection connection = MySQLConnection.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
        ) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("title"));
                System.out.println(resultSet.getString("_description"));
                System.out.println("------------");
            }

        } catch (DBConnectionException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ex2() {
        String query = "select * from tasks where id = ? and title = ?";
        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

        ) {
            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "task3");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("title"));
                System.out.println(resultSet.getString("_description"));
                System.out.println("------------");
            }

        } catch (DBConnectionException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void ex3() {
        String query = "delete from tasks where id = ?";
        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, 4);
            int result = preparedStatement.executeUpdate();
            System.out.println(result);
        } catch (DBConnectionException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ex4() {
        String query = "insert into tasks (title, _description) values (?, ?)";

        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ) {
            preparedStatement.setString(1, "Test Title");
            preparedStatement.setString(2, "Test description");

            int insertingRow = preparedStatement.executeUpdate();
            System.out.println(insertingRow);

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys();) {
                if (generatedKeys.next()) {
                    System.out.println("Task id:" + generatedKeys.getInt(1));
                }
            }

        } catch (DBConnectionException | SQLException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void ex5() {

        String queryAddress = "insert into address (city, zip_code) values (?, ?)";
        String queryPerson = "insert into person (fullname, email, birth_date, address_id ) values (?, ?, ?, ?)";

        try (
                Connection connection = MySQLConnection.getConnection();
                PreparedStatement preparedStatementAddress = connection.prepareStatement(queryAddress, Statement.RETURN_GENERATED_KEYS);
        ) {
            connection.setAutoCommit(false);
            preparedStatementAddress.setString(1, "Oslo");
            preparedStatementAddress.setString(2, "12345");

            preparedStatementAddress.executeUpdate();
            Integer addressId = null;
            try(ResultSet resultSet = preparedStatementAddress.getGeneratedKeys();) {
                if (resultSet.next()) {
                    addressId = resultSet.getInt(1);
                }
            }

            if (addressId == null){
                throw new RuntimeException("Address Id was null");
            }

            try (
                    PreparedStatement preparedStatementPerson = connection.prepareStatement(queryPerson, Statement.RETURN_GENERATED_KEYS);
            ) {
                preparedStatementPerson.setString(1, "Maja Wilmer");
                preparedStatementPerson.setString(2, "Maja@outlook.com");
                preparedStatementPerson.setDate(3, Date.valueOf(LocalDate.parse("2000-05-08")));
                preparedStatementPerson.setInt(4, addressId);

                preparedStatementPerson.executeUpdate();
                try (ResultSet resultSetPerson = preparedStatementPerson.getGeneratedKeys();) {
                    if (resultSetPerson.next()) {
                        System.out.println("PersonId : " + resultSetPerson.getInt(1));
                    }
                }
            }
            connection.commit();

        } catch (DBConnectionException | SQLException e) {
            System.out.println(e.getMessage());
        }


    }


}
