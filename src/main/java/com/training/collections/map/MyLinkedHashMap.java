package com.training.collections.map;

/**
 * Created by amanurat on 3/17/15 AD.
 */
import java.util.*;

public class MyLinkedHashMap {

    public static void main(String args[ ]) {
        int iNum = 0;
        LinkedHashMap myMap = new LinkedHashMap( );

        myMap.put("name", "Jody");
        myMap.put("id", new Integer(446));
        myMap.put("address", "Manila");
        myMap.put("type", "Savings");

        Collection values = myMap.values( );
        Iterator iterator = values.iterator( );

        while(iterator.hasNext()) {
            System.out.println(iterator.next( ));
        }
    }
}