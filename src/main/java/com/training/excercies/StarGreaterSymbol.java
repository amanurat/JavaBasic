package com.training.excercies;

public class StarGreaterSymbol {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int numStars = 0; numStars < 4 - Math.abs(3 - i); numStars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
