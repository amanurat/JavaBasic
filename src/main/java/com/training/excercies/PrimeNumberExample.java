package com.training.excercies;

import java.util.Scanner;

/**
 * Simple Java program to print prime numbers from 1 to 100 or any number.
 * A prime number is a number which is greater than 1 and divisible
 * by either 1 or itself.
 */
public class PrimeNumberExample {

    public static void main(String args[]) {

        //get input till which prime number to be printed
        System.out.println("Enter the number till which prime number to be printed: ");
        int limit = new Scanner(System.in).nextInt();

        //printing primer numbers till the limit ( 1 to 100)
        System.out.println("Printing prime number from 1 to " + limit);
        for (int number = 2; number <= limit; number++) {
            //print prime numbers only
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }

    }

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; //number is divisible so its not prime
            }
        }
        return true; //number is prime now
    }


    /*
     * Second version of isPrimeNumber method, with improvement like not
     * checking for division by even number, if its not divisible by 2.
     */
    public static boolean isPrimeNumber(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Third way to check if a number is prime or not.
     */
    public static String isPrimeOrNot(int num) {
        if (num < 0) {
            return "not valid";
        }
        if (num == 0 || num == 1) {
            return "not prime";
        }
        if (num == 2 || num == 3) {
            return "prime number";
        }
        if ((num * num - 1) % 24 == 0) {
            return "prime";
        } else {
            return "not prime";
        }
    }
}