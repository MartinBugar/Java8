package com.martyx.Patterny.factory;

public class Factory {

    //metoda mi vytvori celu instanciu kladivo tak ako ju ja potrebujem
    public static Kladivo createKladivo(){
        Kladivo kladivo = new Kladivo();
        System.out.println("instancia kladivo vytvorena");
        //....
        return kladivo;
    }
}
