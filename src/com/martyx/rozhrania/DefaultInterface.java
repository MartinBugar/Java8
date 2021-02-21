package com.martyx.rozhrania;

public interface DefaultInterface {
  void metodaPrva();
  void metodaDruha();

    default void metodaTretia(){ // nebude vynutena implementacia tejto metody
        System.out.println("Daco sa vypise z  DefaultInterface");
    }
}
