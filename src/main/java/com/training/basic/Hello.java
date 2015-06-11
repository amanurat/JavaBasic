/*
 * Copyright (c) 2004 David Flanagan.  All rights reserved.
 * This code is from the book Java Examples in a Nutshell, 3nd Edition.
 * It is provided AS-IS, WITHOUT ANY WARRANTY either expressed or implied.
 * You may study, use, and modify it for any non-commercial purpose,
 * including teaching and use in open-source projects.
 * You may distribute it non-commercially as long as you retain this notice.
 * For a commercial use license, or to purchase the book, 
 * please visit http://www.davidflanagan.com/javaexamples3.
 */
package com.training.basic;                          // A unique class name prefix
public class Hello {                         // Everything in Java is a class
    public static void main(String[] args) { // All programs must have main()
//        System.out.println("Hello World!");  // Say hello!


        for (int i = 2; i < 100; i++) {

            /*if (isPrime(i)) {
                System.out.print(i + " ");
            }*/

            boolean isPrime = true;
            for(int j=2;j<i;j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;

                }
            }

            if (isPrime) {
                System.out.println(i);
            }

        }
    }

    //checks whether an int is prime or not.
    static boolean isPrime(int i) {
        for(int j=2;j<i;j++) {
            if(i%j==0)
                return false;
        }
        return true;
    }// This marks the end of main()
}                                            // Marks the end of the class
