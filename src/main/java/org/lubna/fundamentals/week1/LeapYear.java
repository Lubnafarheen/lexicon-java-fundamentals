package org.lubna.fundamentals.week1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //manual input

        int year = 2019;

        boolean x = (year % 4 == 0);
        boolean y = (year % 100 == 0);
        boolean z = (year % 400 == 0);
            if (x && y && z){
                System.out.println("This is a leap year!");
            }
            else{
                System.out.println("This is not a leap year");
            }

            //user input

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scan.nextInt();

        boolean x = (year % 4 == 0);
        boolean y = (year % 100 == 0);
        boolean z = (year % 400 == 0);
        if (x && y && z){
            System.out.println("This is a leap year!");
        }
        else{
            System.out.println("This is not a leap year");
        }*/



    }
}
