package com.martyx.Patterny;

import com.martyx.Patterny.factory.Factory;
import com.martyx.Patterny.factory.Kladivo;

public class Main {

    public static void main(String[] args) {
        singletonMetoda();
        factoryMetoda();
    }

    private static void factoryMetoda() {
        Kladivo kladivo = Factory.createKladivo(); // vytvori mi uz nasetovane kladivo take ake chcem podla factory
    }

    private static void singletonMetoda() {
        SingletonExample singletonExample1 = SingletonExample.getInstancia(); // da sa spravit len tato jedna instancia
        SingletonExample singletonExample2 = SingletonExample.getInstancia(); // ukazuje na tu istu instanciu, nie na novo vytvorenu

        //porovnanie
        if (singletonExample1.equals(singletonExample2)){
            System.out.println("rovnaju sa");
        } else {
            System.out.println("nerovnaju sa");
        }


    }
}
