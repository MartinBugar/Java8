package com.martyx.inputOutput;

import java.io.*;

public class LineStreams {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("resources/input.txt"));
            printWriter = new PrintWriter(new FileWriter("resources/output.txt"));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                printWriter.println(line);
            }
        } finally {
            if (bufferedReader != null){
                bufferedReader.close();
            }

            if (printWriter != null){
                printWriter.close();
            }
        }


    }
}
