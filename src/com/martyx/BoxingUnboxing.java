package com.martyx;

public class BoxingUnboxing {
    public static void main(String[] args) {

        Integer integer = new Integer(10);
        boolean b1 = new Boolean(true);

        System.out.println("Maximalna hodnota integeru : " + Integer.MAX_VALUE);
        System.out.println("Minimalna hodnota integeru " + Integer.MIN_VALUE);
        System.out.println(Integer.max(10,20));
        System.out.println(Integer.min(10,20));
        System.out.println(Integer.compare(20,20));

        int i = 10;

        //Konverzia integeru na String
        String s = String.valueOf(i);
        System.out.println(s);

        //Konverzia double na string
        double db = 10.55;
        String sd = String.valueOf(db);
        System.out.println(db);
    }

}
