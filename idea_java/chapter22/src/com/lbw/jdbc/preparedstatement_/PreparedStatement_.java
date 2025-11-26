package com.lbw.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

// 演示 PreparedStatement 的使用方法
public class PreparedStatement_ {
    public static void main(String[] args) throws Exception {

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
//        Statement statement = connection.createStatement();
//        String query = "select `name`,pwd from manager where `name`='"+ user1 +
//                "' and pwd = '"+ pwd +"'" ;
//        ResultSet resultSet = statement.executeQuery(query);

        String query = "select `name`, pwd from manager where `name` = ? and pwd = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,user1);
        preparedStatement.setString(2,pwd);
        ResultSet resultSet = preparedStatement.executeQuery();


        if(resultSet.next()) {
            System.out.println("登录成功！");
        }
        else {
            System.out.println("登录失败！");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
        fileInputStream.close();


    }
}
