package com.martyx.inputOutput;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) {

        Path path = Paths.get("D:\\CODING\\KURZopakovanie\\Java8\\resources\\input.txt");

        System.out.format("toString : %s%n",path.toString());
        System.out.format("getFileName : %s%n",path.getFileName());
        System.out.format("getName(0) : %s%n",path.getName(0));
        System.out.format("getnameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2) : %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        System.out.println();

        System.out.println("toString : " + path.toString());


        //try with resources - pri takomto pouziti nemusim zatvarat subor - spravi sa to automaticky
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            bufferedReader.readLine();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }

        try(Scanner scanner = new Scanner(Files.newBufferedReader(path))){
            scanner.nextLine();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }



}
