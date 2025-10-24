package com.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
//    演示读取文件,read() 一个字节读，效率较低
    public void readFile01() throws IOException {
        String path = "d:\\hello.txt";
        int readDate = 0;
//        于是乎将 fileInputStream 拿出来
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            while ((readDate = fileInputStream.read()) != -1) {
                System.out.print((char) readDate);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            必须关闭文件流，避免造成资源浪费
            fileInputStream.close(); // 问题来了，fileInputStream 在 try 代码块，finally 不知道他
//            问题又来了，close 也要报错 ：就try -catch 或直接 throws
        }
    }

    @Test
//    演示读取文件,read(byte[] b) 一次读取 b.length 个字节
    public void readFile02() throws IOException {
        String path = "d:\\hello.txt";
        byte[] b = new byte[8]; // 指定 read 一次可以读取 8 个 字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            while ((readLen = fileInputStream.read(b)) != -1) {
                System.out.print(new String(b,0,readLen));// 转字符串输出
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            必须关闭文件流，避免造成资源浪费
            fileInputStream.close(); // 问题来了，fileInputStream 在 try 代码块，finally 不知道他
//            问题又来了，close 也要报错 ：就try -catch 或直接 throws
        }
    }
}
