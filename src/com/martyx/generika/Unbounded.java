package com.martyx.generika;

import java.util.HashMap;

public class Unbounded {
    public static void main(String[] args) {

        HashMap <Long,String> mapa1 = new HashMap();
        mapa1.put(10L, "martin");

        printMap(mapa1);
        printMap2(mapa1);


    }

    //namiesto generika je otaznik s neombezdenou moznostou pouziatia typu - neda sa vkladat, len vyberat
    public static void printMap (HashMap<Long,?> kolekcia){
        for (Long key : kolekcia.keySet()){
            System.out.println(kolekcia.get(key));
        }
    }


    //do tejto metody vstupuje Hasmapa s lubovolnym typom namiesto P - da sa aj vkladat aj vyberat
    public static <P> void printMap2 (HashMap<Long, P> kolekcia){
        for (Long key : kolekcia.keySet()){
            P value = kolekcia.get(key);
            kolekcia.put(10L,value); // vkladana hodnota musi byt typu P
            System.out.println(kolekcia.get(key));
        }
    }
}
