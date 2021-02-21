package com.martyx.Exceptions;

import com.martyx.utils.Osoba;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        Osoba dospelaOsoba = new Osoba("Ma", "Bugar", 22);

        if (dospelaOsoba.getVek() < 18) {
            throw new InvalidAgeException("Osoba nie je dospela");
        } else{
            System.out.println("osoba je dospela");
        }

        if (dospelaOsoba.getMeno().length() < 4 ){
            throw new ShortNameException("kratke meno ");
        } else {
            System.out.println("mas pohode meno");
        }

    }
}
