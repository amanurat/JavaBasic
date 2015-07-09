package com.training.basic;

/**
 * Created by amanurat on 3/10/15 AD.
 */
public class TypeConversion {

    public static void main(String[] args) {
        int integer1 = 10;
        long longImplcitValue = integer1;

        System.out.println("integer1 : "+ integer1);
        System.out.println("longImplcitValue : "+ longImplcitValue);


        long long1 = 100;
        int integerExplicitValue = (int) long1;
        System.out.println("integerExplicitValue : "+ integerExplicitValue);

    }

}
