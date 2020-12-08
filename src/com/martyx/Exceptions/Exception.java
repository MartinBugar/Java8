package com.martyx.Exceptions;

import com.martyx.Utils.Osoba;

public class Exception {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Martin", "Bugar", 26);
        osoba.setMeno(null);
        System.out.println(osoba.getMeno().toLowerCase());



//        try {
//            delenie(10.0, 0.0);//metodu mi posunulo sem ale treba ju riesit
//        } catch (java.lang.Exception e) {
//            System.err.println("CHYBAAAAAA   " + e.getMessage());
//            e.printStackTrace(System.err);
//        }
//
//        delenie2(10.0, 0.0);
 }

    public static double delenie (double x, double y) throws java.lang.Exception {
        if (y == 0){
            throw new java.lang.Exception("Argument 'y' je 0 POZOR NATO");//dedi od exception preto ju treba sem vyhdit a posunut hore
        }
        return x / y;
    }

    public static double delenie2( double x, double y){
        if (y == 0){
            throw new ArithmeticException("Argument 'y' je 0 POZOR NATO");// dedi od runtimeexception a preto ju netreba vyhadzovat do metody hore
        }
        return x/y;
    }
}
