package com.training.collections.list;

/**
 * Created by amanurat on 3/17/15 AD.
 */
import java.util.Vector;

public class MyVector {

    public static void main(String args[ ]) {

        Vector vecky = new Vector( );

        vecky.add(new Integer(1));
        vecky.add(new Integer(2));
        vecky.add(new Integer(3));

        for(int x=0; x<3; x++) {
            System.out.println(vecky.get(x));
        }
    }
}