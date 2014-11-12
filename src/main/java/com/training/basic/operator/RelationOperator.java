package com.training.basic.operator;

/**
 * Created by amanurat on 11/12/14 AD.
 */
public class RelationOperator {

    public static void main(String[] args) {

        int x = 5;
        int y = 3 + 2;

// Does not compile
        /*if (x = y) {
            // Do something
        }*/

// You must use equality operator
        if (x == y) {
            // Do something
        }


    }
}
