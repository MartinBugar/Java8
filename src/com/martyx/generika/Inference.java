package com.martyx.generika;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inference  {

    public static <T> T pick (T a1, T a2){
        return a1;
    }

    public static void main(String[] args) {
        Object object = pick("d", new ArrayList<String>()); // ide to lebo ich spolocny predok od ktoreho dedia je serializable
    }
}
