package com.martyx.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map <Integer, String> map = new HashMap<>(); // prvy parameter je key

        map.put(10, "martin");
        map.put(1, "fero");
        map.put(1, "duro"); // prepise predchadyajuci element

        System.out.println(map.get(1));
    }
}
