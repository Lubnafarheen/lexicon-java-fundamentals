package org.lubna.fundamentals.week1.assignment;

import java.util.Scanner;

public class PrintUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String takingNameAsUserInput = sc.nextLine();
        System.out.println("Hello! "  + takingNameAsUserInput);
    }
}
