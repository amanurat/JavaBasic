package com.training.oop.inheritance;

/**
 * Date: 10/2/2014
 * Time: 4:18 PM
 *
 * @author assanai.manurat
 */
class Dog extends Mammal{

    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    public static void polymorphism(Animal animal) {
        animal.eat();
    }

    public static void main(String args[]){

        Mammal m = new Mammal();
        Dog d = new Dog();
        Reptile r = new Reptile();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);

        polymorphism(m);
        polymorphism(d);
        polymorphism(r);
    }

}