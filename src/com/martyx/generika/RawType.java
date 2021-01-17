package com.martyx.generika;

import java.util.ArrayList;
import java.util.List;

public class RawType {
    public static void main(String[] args) {
        GenericBox <String> stringBox;
        GenericBox rawBox; // nie je zadefinovany typ generika, doplni sa podla vlozenych parametrov

        List names = new ArrayList(); // takisto nieje vlozeny typ generika
        names.add("marcelinoooo");
        names.add("the vampireee");


        for (Object s : names){
            System.out.println(s);
        }

    }
}
