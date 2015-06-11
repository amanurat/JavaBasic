package com.training.collections;

import java.util.*;

/**
 * Date: 10/3/2014
 * Time: 11:08 AM
 *
 * @author assanai.manurat
 */
public class CollectionDemo {

    public static void main(String[] args) {

        Collection collection = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Set set = new HashSet();
        Map map = new HashMap();
        Queue queue = new ArrayDeque();


        collection.add("Collection1");

        arrayList.add("ArrayList1");

        set.add("Set1");

        map.put("1", "Map1");

        queue.add("A");
        queue.add("B");


        while (!queue.isEmpty()) {
//            System.out.println(queue.remove());
            System.out.println(queue.poll());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
