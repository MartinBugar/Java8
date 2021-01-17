package com.martyx.generika;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GenerickaMetoda {

    private static <T> ArrayList<T> preklopMaNaList (HashMap <Long, T> collection){ // na zaciatku musim introducnut typ generika
        ArrayList <T> list = new ArrayList<>();

        for (Long key : collection.keySet()){
            list.add(collection.get(key));
        }
        return list;
    }

    public static void main(String[] args) {

        //PRACA S GENERICKYM STRINGOM
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedHashMap <Long, String> stringLinkedHashMap = new LinkedHashMap<>();

        stringLinkedHashMap.put(1L, "a");
        stringLinkedHashMap.put(2L, "b");
        stringLinkedHashMap.put(3L, "c");

        stringArrayList = preklopMaNaList(stringLinkedHashMap);
        System.out.println(stringArrayList);

        //PRACA S GENERICKYM INTEGEROM
        ArrayList <Integer> integerArrayList = new ArrayList<>();
        LinkedHashMap <Long, Integer> integerLinkedHashMap = new LinkedHashMap<>();

        integerLinkedHashMap.put(1l, 1);
        integerLinkedHashMap.put(2l, 2);
        integerLinkedHashMap.put(3l, 3);

        integerArrayList = preklopMaNaList(integerLinkedHashMap);
        System.out.println(integerArrayList);
    }
}
