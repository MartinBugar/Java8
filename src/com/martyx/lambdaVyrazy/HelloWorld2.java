package com.martyx.lambdaVyrazy;

public class HelloWorld2 {

//    public void printHelloWorld2(Lambda lambda, String string){
//        lambda.printHelloWorld(string);
//    }

    public static void main(String[] args) {

        Lambda lambdaIntf = (String string) -> System.out.println(string);
        HelloWorld2 helloWorld2 = new HelloWorld2();

        lambdaIntf.printHelloWorld("Ahoj svet");


    }



}
