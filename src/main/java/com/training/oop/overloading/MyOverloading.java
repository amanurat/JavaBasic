package com.training.oop.overloading;

/**
 * Created by amanurat on 9/13/14 AD.
 */

public class MyOverloading {

    public MyOverloading(){
        char value[] = { 'a','c'};


        String char1 = new String(new char[]{'t','e','s','t'});

        String char2 = new String(new char[]{'t','e','s','t'});

        System.out.println("char1 : " + char1);
        System.out.println("char2 : " + char2);


        if (char1.equals(char2)) {
            System.out.println("String is equal");
        } else {
            System.out.println("String not equal");
        }


        System.out.println("Inside default constructor");
    }
    public MyOverloading(int i){
        System.out.println("Inside single parameter constructor with int value");
    }
    public MyOverloading(String str){
        System.out.println("Inside single parameter constructor with String object");
    }
    public MyOverloading(int i, int j){
        System.out.println("Inside double parameter constructor");
    }

    public static void main(String a[]){
        MyOverloading obj = new MyOverloading();
        MyOverloading obj1 = new MyOverloading(10);
        MyOverloading obj2 = new MyOverloading(10,20);
        MyOverloading obj3 = new MyOverloading("hello");
    }
}