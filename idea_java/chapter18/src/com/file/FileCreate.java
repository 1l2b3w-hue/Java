package com.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

// 演示创建文件
public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
//    方式1 ： 根据路径创建文件 new File(String filePath)
    public void create1() {
        String filePath = "d:\\new1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile(); // I/O 异常，解决就行
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
//    方式2 ： 根据父目录文件 + 子路径构建 new File(File parent,String child)
    public void create2() {
        File parentfile = new File("d:\\");
        String filePath = "new2.txt";
        File file = new File(parentfile, filePath);
        //file 只是一个Java对象，还在内存中
//        只有执行了creatNewFile，才会真正在磁盘中创建一个文件
        try {
            file.createNewFile(); // 真正在磁盘中创建一个文件
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
//     方式3 ： 父目录 + 子路径 new File(String parent,String child)
    public  void create3() {
        File file = new File("d:\\", "new3.txt");
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
