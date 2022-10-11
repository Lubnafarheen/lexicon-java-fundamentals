package org.lubna.fundamentals.week1;

public class PrintName {
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "Lubna";
        System.out.println("Hello \n" + name);

        /*
        String name = "Lubna";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello \n" + name);
         */

        /*
        if (args.length > 0) {
            System.out.println("Hello \n" + args[0]);
        } else {
            System.out.println("Hello \nLubna");
        }
        */

        /*
        System.out.println("Hello \nLubna");
        */

         /*
        System.out.println("Hello");
        System.out.println("Lubna");
        */
    }
}
