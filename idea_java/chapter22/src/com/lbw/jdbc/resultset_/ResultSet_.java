package com.lbw.jdbc.resultset_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ResultSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
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
        String query = "select id,name,sex,birthday from actor";
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next()) {
            int id = resultSet.getInt(1); // 获取该行第一列
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }

        resultSet.close();
        statement.close();
        connection.close();
        fileInputStream.close();


    }
}
