package com.martyx.kolekcie;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Set <String> set1 = new HashSet<>(); // neuklada poradie elementov
            set1.add("element1");
            set1.add("element2");
            set1.add("element3");
            set1.add("element4");

        Set <String> set2 = new HashSet<>();
            set2.add("element3");
            set2.add("element4");
            set2.add("element5");
            set2.add("element6");

         printSet(set1);
         printSet(set2);
    }

    private static void printSet (Set<String> set){
        System.out.println( "Set : ");
        for (String s : set){
            System.out.println(s);
        }
    }
}
