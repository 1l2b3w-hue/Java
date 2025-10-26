package com.properties_;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws Exception {
//        利用 Properties 创建配置文件
        Properties prop = new Properties();
//       创建键值对
        prop.setProperty("charset", "utf-8");
        prop.setProperty("user", "汤姆"); // 采用 unicode 保存
        prop.setProperty("pwd","88888888");

//        创建文件写入
        prop.store(new FileOutputStream("src\\mysql2.properties"),null);
//        prop.store(new FileWriter("src\\mysql2.properties"), null);
        System.out.println("写入完成");
    }
}
