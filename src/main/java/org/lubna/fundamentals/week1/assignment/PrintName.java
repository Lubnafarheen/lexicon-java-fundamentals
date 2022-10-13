package org.lubna.fundamentals.week1.assignment;

public class PrintName {
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "Lubna";
        System.out.println("Hello \n" + name);
    }
}
