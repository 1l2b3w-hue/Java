package com.writer_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {

    }

    @Test
    public void write() {
         String str = "风雨之后,定见彩虹";
         String filePath = "d:\\note.txt";
         FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileWriter != null) {
                try {
                    fileWriter.close();// 一定要关闭或刷新,否则写入内容只在内存中
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Test
    public void write2() {
        String str = "风雨之后,定见彩虹";
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;
        char[] buf = str.toCharArray();
        try {
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write(buf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
