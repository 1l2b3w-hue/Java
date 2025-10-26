package com.transformation_;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) {
        String filePath = "d:\\hello2.txt";


//        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
//            //        将一个字节流 FileInputStream 转成 InputStreamReader,并指定编码
//            isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
////            再将 InputStreamReader 转成 BufferedReader
//            br = new BufferedReader(isr);
//            一步到位
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));
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
