package org.lubna.fundamentals.week3.Strings;

public class FindIndexPositionOfAChar {
    public static void main(String[] args) {
        String exampleOne = "Long example sentence";
        System.out.println("The char "+exampleOne.charAt(6) + " is at position 6 in the following String.\n");

        String exampleTwo = "Even Longer example sentence";
        System.out.println("The index position of \"o\" in the following String is " + exampleTwo.indexOf("o"));
    }
}
