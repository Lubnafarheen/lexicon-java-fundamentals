package org.lubna.fundamentals.week3.Strings;

public class OverLoadingExample {

    public static void main(String[] args) {
        System.out.println(add(12, 56));
        System.out.println(add(57.9, 45.3));

    }
    public static int add (int num1, int num2){
        return num1 + num2;
    }
    public static double add (double num1, double num2){
        return num1 + num2;
    }
}
