package com.martyx.generika;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inference  { // inferencia je sposob ako si java zisti aky typ premmennej ma deklarovat podla vlozenia

    //klasicka genericka metoda
    public static <T> T pick (T a1, T a2){// v tomto pripade T nemusi predstavovat rovnaky typ premennej - musia mat ale spolocneho predka
        return a1;
    }

    public static void main(String[] args) {
        Object object = pick("d", new ArrayList<String>()); // ide to lebo ich spolocny predok od ktoreho dedia je serializable
    }
}
