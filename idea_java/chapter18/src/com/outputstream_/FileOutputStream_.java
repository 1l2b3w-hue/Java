package com.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void write() {
        String filePath = "d:\\a.txt";

        FileOutputStream fileOutputStream = null;

        try {
//            fileOutputStream = new FileOutputStream(filePath); // 每次书写会覆盖原内容
//            使每次写入都是在文件末尾而不是文件头
            fileOutputStream = new FileOutputStream(filePath, true);
//            fileOutputStream.write('H'); // 写入 H
            String content = "This is a test"; // 写入该内容
//            fileOutputStream.write(content.getBytes());
            fileOutputStream.write(content.getBytes(),0,4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
