package com.properties_;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        //1.创建 Properties 对象
        Properties prop = new Properties();
        //2.读取文件
        prop.load(new FileReader("src\\mysql.properties"));
        //3.控制台显示
        prop.list(System.out);
        //4.获取指定内容
        String user = prop.getProperty("user");
        String pwd = prop.getProperty("pwd");
        System.out.println("user = " + user);
        System.out.println("pwd = " + pwd);

        //5. 将键值对添加到新的文件中：mysql2.properties
//        prop.store(new FileWriter("src\\mysql2.properties"),null);

    }
}
