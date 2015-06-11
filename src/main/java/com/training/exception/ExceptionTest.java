package com.training.exception;

/**
 * Created by amanurat on 3/19/15 AD.
 */
public class ExceptionTest {


    public static void main(String[] args) {

        try {
            aMethod();

        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("finished");


    }

    private static void aMethod() throws Exception {

        try {
//            throw new Exception();

            System.out.println("AA");
        } finally {
            System.out.println("finally");
        }


    }
}
