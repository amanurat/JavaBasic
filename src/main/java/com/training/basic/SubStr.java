package com.training.basic;

/**
 * Created by amanurat on 3/11/15 AD.
 */
class SubStr {
    public static void main(String args[]) {
        String orgstr = "Java makes the Web move.";
        // construct a substring

        String substr = orgstr.substring(5, 18);
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

        orgstr = orgstr.substring(5, 18);
        System.out.println("result: " + orgstr);


    }
}
