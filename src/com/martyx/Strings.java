package com.martyx;

import java.util.Calendar;
import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
       // formatovanie();
       // advancedFormatovanie();

    }

    private static void advancedFormatovanie() {
        Calendar calendar = Calendar.getInstance(Locale.forLanguageTag("sk_SK"));
        String s1 = String.format("Matove narodky  : %1$td %1$tb %1$ty", calendar);
        System.out.println(s1);
    }

    private static void formatovanie() {

        int i = 2018;
        String meno = "martin";
        System.out.println("V roku " + i  + " " + meno + " robil kurz java ");

        System.out.printf("%b %n", true);
        System.out.printf("%b %n",  meno);
        System.out.printf("%c %n", 'j');
        System.out.printf("%d %n", 10);
        System.out.printf("%f %n", 10.55);
        System.out.printf("a%nb %n ");

        System.out.println("-------------------------");
        String string1 = String.format("%d", 15555);
        System.out.println(string1);


    }
}
