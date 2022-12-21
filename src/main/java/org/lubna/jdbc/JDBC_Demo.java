package org.lubna.jdbc;

import org.lubna.jdbc.model.Person;
import org.lubna.jdbc.model.Task;

import java.sql.*;

public class JDBC_Demo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lecture_db", "root", "12345678");

            Statement statement = connection.createStatement();

           // String selectAllTasks = "select * from tasks";
           // String selectAllTasks = "select id, title, _description, person_id  from tasks";
            String selectAllTasks = "select t.id, t.title, t._description, t.person_id, p.* from tasks t left join person p on t.person_id = p.id";

            ResultSet resultSet = statement.executeQuery(selectAllTasks);

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("_description");
                int personId = resultSet.getInt("person_id");

                Task task = new Task(id, title, description);

                String fullName = resultSet.getString("p.fullname");
                Date registeredDate = resultSet.getDate("p.reg_date");
                boolean active = resultSet.getBoolean("p._active");

                Person person = new Person(personId, fullName, registeredDate.toLocalDate(), active);

                task.setPerson(person);

                //System.out.println(id +" "+ title +" "+ description +" "+ personId +" "+fullName +" "+ registeredDate +" "+active);

                System.out.println(task);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
