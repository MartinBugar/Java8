package com.martyx.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(); // pracuje najrychlejsie,neuchovava poradie hodnot
        set1.add("element1");
        set1.add("element2");
        set1.add("element3");
        set1.add("element4");

        Set<String> set2 = new HashSet<>();
        set2.add("element3");
        set2.add("element4");
        set2.add("element5");
        set2.add("element6");

        printSet(set1);
        printSet(set2);

        System.out.println(set1.contains("element1"));

        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void printSet (Set<String> set){
        for (String s : set ){
            System.out.println(s);
        }
        System.out.println();
    }
}
