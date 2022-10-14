package org.lubna.fundamentals.week1;

import java.util.Scanner;

public class PrintAverage {
//double num1, num2, num3;
//
//    public static double averageNumber(double num1, double num2, double num3) {
//         double result = (num1 + num2 + num3) / 3;
//      return result;
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Enter third number: ");
        double c = sc.nextDouble();

        double result =(a+b+c)/3;

        System.out.println(result);
        }
        //System.out.println(PrintAverage.averageNumber(10, 20, 30));
    }

