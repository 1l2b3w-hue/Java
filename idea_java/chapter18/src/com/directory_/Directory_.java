package com.directory_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.InputStream;

public class Directory_ {
    public static void main(String[] args) {
//        InputStream
    }

    @Test
    public void delFile() {
        File file = new File("d:\\new1.txt");
        if(file.exists()) {
            file.delete();
            System.out.println("文件已删除");
            return;
        }
        System.out.println("文件不存在");
    }

    @Test
    public void delDir() {
        File file = new File("d:\\file");
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("目录已删除");
                return;
            }
            else {
                System.out.println("目录删除失败");
            }
        }
        System.out.println("文件不存在");
    }

    @Test
    public void delDir2() {
        File file = new File("d:\\file\\a\\b\\c");
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("目录已删除");
            }
            else {
                System.out.println("目录删除失败");

            }
        }
        else {
            if(file.mkdirs()) {
                System.out.println("目录创建成功");
            }
            else {
                System.out.println("目录创建失败");
            }
        }
    }
}
