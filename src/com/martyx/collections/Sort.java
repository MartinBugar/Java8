package com.martyx.collections;

import com.martyx.Utils.Osoba;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

    private static final Comparator<Osoba> VEK_TRIEDENIE = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) { // ak o1 a o2 su rovnake vrati mi 0
            return o1.getVek() == o2.getVek() ? 0 :  ( o1.getVek() < o2.getVek() ? -1 : 1 );

        }
    };

    public static void main(String[] args) {
        Osoba[] osobaArray = {
                new Osoba("martin1","bugar1", 21),
                new Osoba("martin2","bugar2", 22),
                new Osoba("martin3","bugar3", 23),
                new Osoba("martin4","bugar4", 24)
        };

        List<Osoba> osoby = Arrays.asList(osobaArray);
        System.out.println(osoby);

        Collections.sort(osoby);
        System.out.println(osoby);

        Collections.sort(osoby, VEK_TRIEDENIE);
    }
}
