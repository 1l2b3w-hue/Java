package com.transformation_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
    public static void main(String[] args) {
//        读取 d:\\hello2.txt
//        创建一个字符输入流

//        默认情况下，读取文件按照 utf-8 来读取，当改为其他编码时，就会产生乱码
        BufferedReader br = null;
        String filePath = "d:\\hello2.txt";

        try {
            br = new BufferedReader(new FileReader(filePath));
            System.out.println(br.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
