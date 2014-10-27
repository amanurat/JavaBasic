package com.training.exception;

/**
 * Date: 10/3/2014
 * Time: 12:07 PM
 *
 * @author assanai.manurat
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            Integer integer = Integer.parseInt("2s");
        } catch (Exception e) {
            System.out.println("found error : " + e.getMessage());
        } finally {
            System.out.println("finally try-catch");
        }

    }
}
