package com.training.basic.flow;

/**
 * Created by amanurat on 3/10/15 AD.
 */
public class ReturnDemo {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int value : numbers) {


            if (value == 3) {
                continue;
            }

            System.out.println(value);

        }



    }
}
