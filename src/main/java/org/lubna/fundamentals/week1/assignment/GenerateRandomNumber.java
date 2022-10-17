package org.lubna.fundamentals.week1.assignment;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {
    public static final String PRINT_MESSAGE = ("#### WELCOME TO THE LOTTERY GAME #### \n" +
            "Guess the correct number and win our exciting prizes $$ \n ");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int userGuess = 0;
            int numberOfGuesses = 0;

            System.out.println(PRINT_MESSAGE);

            System.out.println("Guess a number between 1 and 500 : ");
            userGuess = scan.nextInt();
            numberOfGuesses++;

            int randomNumber = random.nextInt(500);
            System.out.println(randomNumber);

            if (userGuess == randomNumber) {
                System.out.println("You guessed it right!!!! Congrats you are a winner");
                System.out.println("It took you number of tries to guesss" + numberOfGuesses);
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess was too small.... Try Again! \n");
            } else {
                System.out.println("Your guess was too big.... Try Again! \n");
            }
        }

    }
}
