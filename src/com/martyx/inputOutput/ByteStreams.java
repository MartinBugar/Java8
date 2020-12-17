package com.martyx.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("resources/input.txt");
            fileOutputStream = new FileOutputStream("resources/output.txt");
            int c;

            while ((c = fileInputStream.read()) != -1){ // ak je -1 tak som na konci citania
                fileOutputStream.write(c);
            }
        } finally {
            if (fileInputStream != null){
                fileInputStream.close();
            }

            if (fileOutputStream != null){
                fileOutputStream.close();
            }
        }
    }
}
