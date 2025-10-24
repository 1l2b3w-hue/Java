package com.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
//    获取文件信息
    public void info() {
//        先创建一个文件对象
        File file = new File("d:\\new3.txt");

//        调用相关方法获取信息
        System.out.println("文件名=" + file.getName());
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父目录=" + file.getParent());
        System.out.println("文件大小(字节)=" + file.length());
        System.out.println("文件是否存在=" + file.exists());
        System.out.println("文件是否是文件=" + file.isFile());
        System.out.println("文件是否是目录=" + file.isDirectory());

    }
}
