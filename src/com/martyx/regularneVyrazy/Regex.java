package com.martyx.regularneVyrazy;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //zhoda
        Pattern pattern = Pattern.compile("[a-zA-z][a-zA-Z]vo");
        Matcher matcher = pattern.matcher("havo");
        System.out.println(matcher.matches());
        System.out.println("---------------------------------");
    }
}
