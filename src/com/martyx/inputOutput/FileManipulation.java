package com.martyx.inputOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManipulation {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\CODING\\KURZopakovanie\\Java8\\resources\\input.txt");

        System.out.println("Files.exists " + Files.exists(path)); // overi ci existuje subor
        System.out.println("Files.notExists " + Files.notExists(path)); // overi ci existuje subor

        System.out.println("Files.isReadable " + Files.isReadable(path));
        System.out.println("Files.isHidden " + Files.isHidden(path));
        System.out.println("Files.isDirectory " + Files.isDirectory(path));

    }
}
