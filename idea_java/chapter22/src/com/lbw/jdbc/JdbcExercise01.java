package com.lbw.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcExercise01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\mysql.properties");
        properties.load(fileInputStream);
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("class");

        Class<?> aClass = Class.forName(driver);

        Connection connection = DriverManager.getConnection(url,user,password);
        String createTableSQL = " CREATE TABLE actor2 (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "`name` VARCHAR(50) NOT NULL," +
                "age INT NOT NULL)";
        String value = "insert into actor2 values(null,'王强',20)," +
                "(null,'张三',23),(null,'李四',22),(null,'王五',24),(null,'小明',25)";
        String update = "update actor2 set name = '黎明' where id = 1";
        String delete = "delete from actor2 where id = 3";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableSQL);
        statement.executeUpdate(value);
        statement.executeUpdate(update);
        statement.executeUpdate(delete);

        statement.close();
        connection.close();
        fileInputStream.close();
    }
}
