package com.martyx.rozhrania;

public interface Anotherinterface {

    default void metodaTretia(){ // nebude vynutena implementacia tejto metody
        System.out.println("Daco sa vypise z  AnotherInterface");
    }
}
