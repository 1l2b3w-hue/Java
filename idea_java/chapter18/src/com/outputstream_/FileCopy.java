package com.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

    }

    @Test
    public void copy() {
        String filePath = "d:\\image\\1.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int readLen = 0;
        byte[] buffer  = new byte[10];
        try {
            String filePath1 = "d:\\1_copy.png";
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath1,true);
            while((readLen = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer,0,readLen);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
