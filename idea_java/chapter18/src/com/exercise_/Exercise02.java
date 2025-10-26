package com.exercise_;

import java.io.*;

public class Exercise02 {
    public static void main(String[] args) {
        String filePath = "d:\\hello.txt";
        BufferedReader br = null;
        String line = null;
        int i = 1;
        try {
//            br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));
            while((line = br.readLine()) != null) {
                System.out.println( (i++) + " " + line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
