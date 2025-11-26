package com.lbw.jdbc.statement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

// 演示 SQL 注入
public class Statement_ {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入管理员名：");
        String user1 = scanner.nextLine();
        System.out.print("请输入管理员密码：");
        String pwd = scanner.nextLine();

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\mysql.properties");
        properties.load(fileInputStream);
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("class");

        Class<?> aClass = Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String query = "select `name`,pwd from manager where `name`='"+ user1 +
                    "' and pwd = '"+ pwd +"'" ;
        ResultSet resultSet = statement.executeQuery(query);

        if(resultSet.next()) {
            System.out.println("登录成功！");
        }
        else {
            System.out.println("登录失败！");
        }

        resultSet.close();
        statement.close();
        connection.close();
        fileInputStream.close();


    }
}
