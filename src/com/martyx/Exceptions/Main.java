package com.martyx.Exceptions;

import com.martyx.Utils.Osoba;

public class Main {
    public static void main(String[] args) {
        Osoba dospelaOsoba = new Osoba("Martin", "Bugar", 15);

        if (dospelaOsoba.getVek() < 18) {
            throw new InvalidAgeException("Osoba nie je dospela");
        } else{
            System.out.println("osoba je dospela");
        }

    }
}
