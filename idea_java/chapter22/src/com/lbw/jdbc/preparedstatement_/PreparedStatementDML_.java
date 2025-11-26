package com.lbw.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

// 演示 PreparedStatement 的使用方法
public class PreparedStatementDML_ {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入添加的管理员名：");
        String user1 = scanner.nextLine();
        System.out.print("请输入添加管理员密码：");
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
        // 添加数据
        //String sql = "insert into manager value (?,?)";

        // 修改
        //String sql = "update manager set pwd = ? where name =  ?";

        // 删除
        String sql = "delete from manager where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(2,user1);
        preparedStatement.setString(1,user1);

        int row = preparedStatement.executeUpdate();

        System.out.println(row > 0 ? "操作成功" : "操作失败");


        preparedStatement.close();
        connection.close();
        fileInputStream.close();


    }
}
