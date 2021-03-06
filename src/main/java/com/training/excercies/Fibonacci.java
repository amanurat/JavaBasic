package com.training.excercies;

import java.util.Scanner;

public class Fibonacci {

    @SuppressWarnings("resource")
    public static void main(String args[]) {

        //input to print Fibonacci series upto how many numbers
        System.out.print("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("\n\nFibonacci series upto " + number + " numbers : ");
        //printing Fibonacci series upto number
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciRecursion(i) +" ");
//            System.out.print(fibonacciLoop(i) + " ");
        }
    }

    // Java program for Fibonacci number using recursion.
    public static int fibonacciRecursion(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        System.out.println(" number : "+ number);

        int v1 = fibonacciRecursion(number - 1);
        int v2 = fibonacciRecursion(number - 2);

        int result = v1 + v2; //tail recursion
        System.out.println("v1 :" + v1 + " , v2 : "+ v2);
        System.out.println("result : "+ result);
        return result;
    }

    // Java program for Fibonacci number using Loop.
    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number
    }
}