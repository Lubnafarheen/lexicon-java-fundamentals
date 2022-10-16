package org.lubna.fundamentals.week1.assignment;

import java.util.Scanner;

public class Calculator {

    public static final String PRINT_FUNCTIONS_OF_CALCULATOR = "##### WELCOME TO CALCULATOR APP ##### \n \n" +
            "Select an Operation you would like to perform : \n " +
            "Press 1. for Addition \n " +
            "Press 2. Subtraction \n " +
            "Press 3. Multiplication \n " +
            "Press 4. Division \n " +
            "Press 5. Other keys to Exit";

    public static void main(String[] args) {

        while (true) {
            System.out.println(PRINT_FUNCTIONS_OF_CALCULATOR);
            Scanner scanner = new Scanner(System.in);
            int selectAnOperation = scanner.nextInt();

            double num1 = 0.0;
            double num2 = 0.0;

            if (selectAnOperation == 1 || selectAnOperation == 2 || selectAnOperation == 3 || selectAnOperation == 4) {
                System.out.println("Enter a number1");
                num1 = scanner.nextDouble();
                System.out.println("Enter a number2");
                num2 = scanner.nextDouble();
            }

            switch (selectAnOperation) {
                case 1:
                    System.out.println("The Sum is " + Calculator.addition(num1, num2) + '\n');
                    break;
                case 2:
                    System.out.println("The Difference is " + Calculator.subtraction(num1, num2) + "\n");
                    break;
                case 3:
                    System.out.println("The Product is " + Calculator.multiplication(num1, num2) + "\n");
                    break;
                case 4:
                    System.out.println("The Quotient is " + Calculator.division(num1, num2) + "\n");
                    break;
                default:
                    System.out.println("Exit");
                    return;
            }
        }

    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}







