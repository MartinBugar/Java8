package com.martyx.generika;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();

        addInteger(list);
        addInteger(list);

    }

    public static void addInteger (List <? super Integer> list){ // beriem vsetky triedy nad Integerom , tzn. az po Number
        int i = (int) (Math.random()*10);
        System.out.println(i);
        list.add(i); // da sa vkladat
        //list.get(i); - toto sa neda - neda sa vyberat
    }


}
