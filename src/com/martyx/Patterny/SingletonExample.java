package com.martyx.Patterny;

public class SingletonExample {

    //musi byt static aby som ju vedel zavolat bez vytvorenia konstruktoru
    private static SingletonExample instancia = null;

    private SingletonExample(){ // tento bezparametricky konstruktor sa da zavolat len z tejto triedy
    }

    public static SingletonExample getInstancia(){
        if (instancia == null){
            instancia = new SingletonExample(); // ak este nie je vytvorena tak sa vytvori
        }
        return instancia;
    }

}
