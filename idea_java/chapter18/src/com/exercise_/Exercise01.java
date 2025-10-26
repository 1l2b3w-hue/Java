package com.exercise_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Exercise01 {
    public static void main(String[] args) throws Exception {
        String dirPath = "d:\\mytemp";
        File dir = new File(dirPath);
        if(!dir.exists()) {
            if(dir.mkdirs()) {
                System.out.println(dirPath + "目录创建成功");
            }
            else {
                System.out.println(dirPath + "目录创建失败");
            }
        }
        String filePath = dirPath + "\\hello.txt";
        File file = new File(filePath);
        if(!file.exists()) {
            if(file.createNewFile()) {
                System.out.println(filePath + "文件创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
                bufferedWriter.write("hello,韩顺平教育");
                bufferedWriter.close();
            }
            else {
                System.out.println(filePath + "文件创建失败");
            }
        }

//        File dir = new File("d:\\mytemp");
//        File file = new File("d:\\mytemp\\hello.txt");
//        if(dir.exists() && dir.isDirectory()) {
//            if(file.exists()) {
//                System.out.println("文件已存在");
//            }
//            else {
//                if(file.createNewFile()) {
//                    System.out.println("文件创建成功");
//                };
//                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//                bufferedWriter.write("hello");
//            }
//        }else {
//            dir.mkdir();
//            file.createNewFile();
//        }
    }
}
