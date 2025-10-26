package com.reader_;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {
    public static void main(String[] args) {

    }

    @Test
    public void readFile() {
        String filePath = "d:\\hello.txt";
        BufferedReader bufferedReader = null;
//        int readData = 0;
        String line = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            while((line = bufferedReader.readLine()) != null) {
//                System.out.print((char)readData);
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
