package com.martyx.inputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("resources/input.txt");
            fileWriter = new FileWriter("resources/output.txt");

            int c;
            while ((c = fileReader.read()) != -1){
                fileWriter.write(c);
            }
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
