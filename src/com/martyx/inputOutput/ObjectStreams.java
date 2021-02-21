package com.martyx.inputOutput;

import com.martyx.utils.Osoba;

import java.io.*;

public class ObjectStreams {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Martin", "bugar",25);


        //Zapis objektu do suboru
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("resources/object.txt"); //object.txt je targetom outputu, pracujem so suborom tak zato FileOutputStream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // vytvorim si objektovy output a do neho vlozim fileoutput, potom do toho moye vstupit objekt
            objectOutputStream.writeObject(osoba);
            objectOutputStream.close();
            System.out.println("DONE");
        } catch (Exception ex){
            ex.getMessage();
            ex.printStackTrace();
        }

        //Citanie objektu zo suboru
        try {
            FileInputStream fileInputStream = new FileInputStream("resources/object.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Osoba osoba2 = (Osoba) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(osoba2.getMeno());
            System.out.println(osoba2.getPriezvisko());
            System.out.println(osoba2.getVek());
        } catch (Exception ex){
            ex.printStackTrace();
        }



    }
}
