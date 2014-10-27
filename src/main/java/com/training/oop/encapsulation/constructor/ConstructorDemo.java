package com.training.oop.encapsulation.constructor;

/**
 * Created by amanurat on 9/13/14 AD.
 */
public class ConstructorDemo {

	private String firstName;

	private String lastName;


    public ConstructorDemo() {
        System.out.println("This is a default constructor");
    }

    public ConstructorDemo(String firstName) {
        this.firstName = firstName;
    }

    public ConstructorDemo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String args[]) {

        System.out.println("This is main");


    }

    public void test() {

    }


}
