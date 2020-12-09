package com.martyx;

import org.w3c.dom.ls.LSOutput;

public class Characters {
    public static void main(String[] args) {
        char ch = 'a';

        //Unicode for uppercase Greek  omega character
        char uniChar = '\u03A9'; // OMEGA
        System.out.println(uniChar);


        char[] charArray = {
                'a',
                'b',
                'c',
                'd',
                'e'
        };

        Character ch2 = ch;
        ch = ch2;

        Character ch3 = new Character('a');

        System.out.println("char : " + ch);
        System.out.println("isLetter : " + Character.isLetter(ch));
        System.out.println("isDigit : " + Character.isDigit(ch));
        System.out.println("isWhiteSpace : " + Character.isWhitespace(ch));
        System.out.println("isUpperCase : " + Character.isUpperCase(ch));
        System.out.println("isLowerCase : " + Character.isLowerCase(ch));
        System.out.println("toUpperCase : " + Character.toUpperCase(ch));
        System.out.println("toLowerCase : " + Character.toLowerCase(ch));
        System.out.println("toString : " + Character.toString(ch));
        System.out.println();

        System.out.println("Some \t nice text. tab");
        System.out.println("Some \b nice text.  backspace");
        System.out.println("Some \n nice text. new line");
        System.out.println("Some \r nice text. carriage return");
        System.out.println("Some \r\n nice text. carriege return a  new line");
        System.out.println("Some \' nice text. ");
        char uvodzovka = '\'';
        System.out.println("SOme \" nice text.");
        System.out.println("Some \\ nice text.");

    }

}
