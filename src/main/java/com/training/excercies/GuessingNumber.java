package com.training.excercies;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

    public static void main(String[] args) {


        int numberToGuess = new Random().nextInt(10) + 1;

        System.out.println("This is number generated : " + numberToGuess);

        Scanner scanner = new Scanner(System.in);
        boolean win = true;

        while(win) {
            System.out.print("Guess a number between 1 - 10 : ");

            int guess = scanner.nextInt();
            if (guess == numberToGuess) {
                System.out.println("Your guess is correct");
                win = false;

            } else if (guess < numberToGuess) {
                System.out.println("Your guess too low...");

            } else if (guess > numberToGuess) {
                System.out.println("Your guess too height...");

            }
        }

    }

}
