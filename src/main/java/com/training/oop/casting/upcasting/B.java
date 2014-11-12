package com.training.oop.casting.upcasting;

/**
 * Created by amanurat on 11/12/14 AD.
 */
class A {
    public void print() {
        System.out.println("Hello from class A");
    }
}
public class B extends A {
    public void print() {
        System.out.println("Hello from class B");
    }

    public static void main(String[] args) {
        A obj = new B();
        obj.print();

        B bObj = (B) new A();
        bObj.print();
    }
}