package com.training.basic.loop;

/**
 * Created by amanurat on 7/20/14 AD.
 */
public class ForLoop {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("====================================");
        System.out.println("For Loop");
        System.out.println("====================================");
        for (String month : months) {
            System.out.println(month);

        }

    }
}
