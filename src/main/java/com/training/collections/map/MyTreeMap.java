package com.training.collections.map;

/**
 * Created by amanurat on 3/17/15 AD.
 */
import java.util.*;

public class MyTreeMap {

    public static void main(String args[]) {

        TreeMap treeMap = new TreeMap( );

        treeMap.put("name", "Jody");
        treeMap.put("id", new Integer(446));
        treeMap.put("address", "Manila");

        Collection values = treeMap.values();
        Iterator iterator = values.iterator( );
        System.out.println("Printing the VALUES....");

        while (iterator.hasNext()) {
            System.out.println(iterator.next( ));
        }
    }
}
