package org.lubna.fundamentals.week1.assignment;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static final String PRINT_MESSAGE = ("#### WELCOME TO GUESS THE NUMBER GAME #### \n" +
            "Guess the correct number and win our exciting prizes $$ \n ");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tries = 0;

        System.out.println(PRINT_MESSAGE);


        while (true) {
            System.out.println("Guess a number between 0 and 3 : ");
            int userGuess = scanner.nextInt();
            int randomNumber = random.nextInt(4);
            tries++;

            if (userGuess == randomNumber) {
                System.out.println("You guessed it right!!!! Congrats you are a winner $");
                System.out.println("It took you " + tries + " tries to guess the number");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("You guessed a small number. \n");
            } else {
                System.out.println(" You guessed a bigger number. \n");
            }
        }

    }
}



