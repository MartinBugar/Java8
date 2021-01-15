package com.martyx.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        list.add("list4");
        list.add("list5");

        System.out.println(list.get(list.size()-1)); //posledny element

        list.add(2,"list2b");
    }
}
