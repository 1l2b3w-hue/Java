package com.lbw.jdbc.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

// 工具类，完成 MySQL的连接和关闭资源
public class JDBCUtils {
    // 一些必要的静态属性
    public static String user;
    public static String password;
    public static String url;
    public static String driver;

    // 静态代码块初始化
    static {
        try {
            Properties prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src\\mysql.properties");
            prop.load(fileInputStream);
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            url = prop.getProperty("url");
            driver = prop.getProperty("class");
        } catch (IOException e) {
            // 将 编译异常 转换为运行异常，方便捕获或默认处理异常
            throw new RuntimeException(e);
        }
    }
    // 获取连接
    public static Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // 关闭资源
    // 进行分析要关闭的资源类型
    // 1. ResultSet
    // 2. Statement 或者 PreparedStatement (Statement 接收)
    // 3. Connection
    public static void close(ResultSet set, Statement statement, Connection connection) {
        try {
            if (set != null) {
                set.close();
            }
            if (statement != null) {
                statement.close();
            }
            if ( connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}


