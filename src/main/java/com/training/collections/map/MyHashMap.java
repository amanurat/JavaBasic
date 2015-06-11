package com.training.collections.map;

/**
 * Created by amanurat on 3/17/15 AD.
 */
import java.util.HashMap;

public class MyHashMap {

    public static void main(String args[ ]) {

        HashMap map = new HashMap( );
        map.put("name", "Jody");
        map.put("id", new Integer(446));
        map.put("address", "Manila");

        System.out.println("Name: " + map.get("name"));
        System.out.println("ID: " + map.get("id"));
        System.out.println("Address: " + map.get("address"));
    }
}