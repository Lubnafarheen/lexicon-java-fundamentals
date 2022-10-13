package org.lubna.fundamentals.week1.assignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an year(YYYY) to check if it is leap. Ex: 2022");
        int year = scanner.nextInt();

        boolean isLeap = LeapYear.checkYearIsLeap(year);
        if (isLeap) {
            System.out.println(year + " is a Leap year!");
        } else {
            System.out.println(year + " is not a Leap year!");
        }
    }

    public static boolean checkYearIsLeap(int year) {
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }
}
