package com.reader_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
    public static void main(String[] args) {

    }
    @Test
    public void readFile() {
        String filePath = "d:\\hello.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            int readData = 0;
            while((readData = fileReader.read()) != -1 ) {
                System.out.print((char)readData);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Test
    public void readFile2() {
        File file = new File("d:\\hello.txt");
        char[] chars = new char[8];
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int readData = 0;
            while((readData = fileReader.read(chars)) != -1) {
                System.out.print(new String(chars,0,readData));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
