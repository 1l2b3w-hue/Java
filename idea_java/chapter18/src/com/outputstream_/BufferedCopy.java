package com.outputstream_;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        String srcFilePath = "d:\\hello.txt";
        String destFilePath = "d:\\hello2.txt";
        BufferedInputStream bis =null;
        BufferedOutputStream bos=null;
        int readData = 0;
        byte[] buffer = new byte[1024];
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            while((readData = bis.read(buffer)) != -1){
                bos.write(buffer, 0, readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(bis != null){
                    bis.close();
                }
                if(bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("拷贝完成");

    }
}
