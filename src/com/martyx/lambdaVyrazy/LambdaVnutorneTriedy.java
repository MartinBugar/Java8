package com.martyx.lambdaVyrazy;

public class LambdaVnutorneTriedy {
    public static void main(String[] args) {

         Lambda2 lambda2 = new Lambda2() {
             @Override
             public void print() {
                 System.out.println("Hello World from inner class");
             }
         };

        Lambda2 lambda3 = () -> System.out.println("Hello from lambda");

        // lambda2.print();

         printIt(lambda2);
         printIt(lambda3);
         printIt(() -> System.out.println("Hello from lambda"));


    }

    public static void printIt(Lambda2 lambda){
        lambda.print();
    }
}
