package com.martyx.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("resources/input.txt"));
        List <Integer> pole = Arrays.asList();
        int i = 0;

        while (scanner.hasNext()){ // hasnext hlada dalsi token

            // defaultny oddelovac tokenov je medzera
            // scanner.useDelimiter(","); // teraz je moj oddelovac tokenov ciarka
            //  System.out.println(scanner.next());//next predstavuje dalsi token
            if (scanner.hasNextInt()) {
                 i = scanner.nextInt();
                pole.add(i);
                System.out.println(pole.toString());
            }

        }

    }
}
