package com.training.basic.loop;

/**
 * Date: 10/2/2014
 * Time: 4:04 PM
 *
 * @author assanai.manurat
 */
class DoWhileDemo {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}