package org.lubna.fundamentals.week9.exceptions;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ThrowExceptions {
    public static void main(String[] args) {
        ex6();

       /* try {
            ex4();
        } catch (CustomInsufficientFoundException e) {
            System.out.println(e.getMessage());
        }*/
        /*try {
            ex3();
        } catch (CustomDataNotFoundException e) {
            System.out.println(e.getMessage());
        }*/
        /*do {
            try {
                ex2();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);*/


        /*do {
            try {
                ex1();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);*/


    }

    public static String ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid Student Id (A-1234)");
        String studentId = scanner.nextLine();

        if (studentId.length() == 0) throw new IllegalArgumentException("StudentId was null");
        if (studentId.length() != 6) throw new IllegalArgumentException("StudentId must contain 6 characters");
        if (!studentId.startsWith("A")) throw new IllegalArgumentException("StudentId must start with A");

        return studentId;
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("## Division Operation ## \n Enter a number1:");
        double n1 = scanner.nextDouble();

        System.out.println("Enter a number2:");
        double n2 = scanner.nextDouble();
        if (n2 == 0) throw new IllegalArgumentException("Number must not be zero");
        double result = n1 / n2;
        System.out.println(result);
    }

    public static void ex3() throws CustomDataNotFoundException {
        List<String> names = Arrays.asList("Anna", "Lisa", "John", "Simon", "Edda");
        Optional<String> result = names.stream().filter(name -> name.equalsIgnoreCase("Ed")).findFirst();
        if (result.isPresent()) System.out.println(result.get());
        else throw new CustomDataNotFoundException("Name information not found", 100);
    }

    public static void ex4() throws CustomInsufficientFoundException {
        double balance = 100;
        System.out.println("Current Balance is : " + balance);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount you want to withdraw");
        double amount = scanner.nextDouble();

        if (amount > balance) throw new CustomInsufficientFoundException("Insufficient balance to withdraw");
        balance = balance - amount;
        System.out.printf("Your Current balance is %s%n", balance);

    }


//finally block
    public static void ex5() {
        BufferedWriter writer = null;
        Path path = Paths.get("Exception/skill.txt");
        try {
            writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND);// If you don't want to replace existing file
            // instead you want to add extra line at the end with the contents we use StandardOpenOption.APPEND
            writer.newLine();
            writer.append("Exception Handling in java");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
//ex5 alternative try with resources technique
    public static void ex6() {
        Path path = Paths.get("source/copy.txt");
        try (
                BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
        ) {
            writer.newLine();
            writer.append("Exception Handling in java");
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
