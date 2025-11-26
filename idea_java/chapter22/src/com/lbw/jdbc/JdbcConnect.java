package com.lbw.jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnect {

    @Test
    public void connect1() throws SQLException {
        Driver driver = new Driver();

        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "lbw");
        Connection connect = driver.connect(url, properties);

        System.out.println("第一种方式" + connect);
        connect.close();
    }

    @Test
    public void connnect2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");

        Driver driver = (Driver)aClass.getConstructor().newInstance();

        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "lbw");
        Connection connect = driver.connect(url, properties);
        System.out.println("第二种方式" + connect);
        connect.close();

    }

    @Test
    public void connect3() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)aClass.getConstructor().newInstance();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "lbw";

        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第三种方式" + connection);
        connection.close();

    }

    @Test
    public void connect4() throws ClassNotFoundException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "lbw";
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("第四种方式" +connection);
        connection.close();
    }

    @Test
    public void connect5() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        FileInputStream fileInputstream = new FileInputStream("src\\mysql.properties");
        properties.load(fileInputstream);
        System.out.println(properties);

        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String className = properties.getProperty("class");

        Class<?> aClass = Class.forName(className);
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("第五种方式" + connection);
        connection.close();

    }

}
