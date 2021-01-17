package com.martyx.generika;

import java.util.ArrayList;
import java.util.List;

public class RawType {
    public static void main(String[] args) {
        GenericBox <String> stringBox;
        GenericBox rawBox; //

        List names = new ArrayList();
        names.add("marcelinoooo");
        names.add("the vampireee");


        for (Object s : names){
            System.out.println(s);
        }
    }
}
