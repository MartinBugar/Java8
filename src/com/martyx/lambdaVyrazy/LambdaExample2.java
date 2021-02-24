package com.martyx.lambdaVyrazy;

public class LambdaExample2 {
    public static void main(String[] args) {

        Delenie delenie = (int a, int b) -> {
            if (b == 0){
                return 0;
            }
            else {
                return a/b;
            }
        };

       double vysledok =  delenie.divide(10,2);
        System.out.println(vysledok);
    }

    interface Delenie {
        double divide(int a, int b);
    }
}
