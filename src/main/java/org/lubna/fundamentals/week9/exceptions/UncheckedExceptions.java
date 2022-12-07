package org.lubna.fundamentals.week9.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class UncheckedExceptions {
    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        int[] numbers = { 1, 3, 5, 6, 8, 2 };
        try {
            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
            System.out.println(numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void ex2() {
        try {
            String text = null;
            System.out.println(text.toUpperCase());
            // if(text!= null) System.out.println(text.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Text was null");
        }
    }

    public static void ex3() {
        try {
            LocalDate date = LocalDate.parse("2022-12-6");//YYYY-MM-DD
            System.out.println(date);
        } catch (DateTimeParseException e) {
            System.out.println(e);
        }
    }
}
