package com.martyx.polymorfizmus;

public abstract class GrafickyObjekt { // ak trieda obsahuje abstraktnu metodu, tak cela musi byt yadefinovana ako abstraktna
    public int x;
    public int y;

    abstract void vykresli(); // abstraktnu triedu musim overridnut pri extendovani od tejto triedy

    public void metodka (){ // tato metoda neni abstrakt takze sa nevinuti
        System.out.println("aaaaavvvvv");
    }


}
