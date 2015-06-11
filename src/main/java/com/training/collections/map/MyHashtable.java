package com.training.collections.map;

/**
 * Created by amanurat on 3/17/15 AD.
 */
import java.util.Hashtable;

public class MyHashtable {

    public static void main(String args[ ]) {

        Hashtable table = new Hashtable( );
        table.put("name", "Jody");
        table.put("id", new Integer(1001));
        table.put("address", new String("Manila"));

        System.out.println("Table of Contents:" + table);
    }
}