package com.lbw.jdbc.datasource_;

import com.lbw.jdbc.utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

// 演示 C3P0 的使用
public class C3P0_ {

    // 方式一 ： 相关参数在程序中指定 user 、url、password
    @Test
    public void c3p0() throws IOException, PropertyVetoException, SQLException {

        // 获取 数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        // 读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("class");

        // 给数据源 comboPoolDataSource 设置相关参数

        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setDriverClass(driver);

        // 设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10); // 表明程序运行开始时，就有10个数据库连接

        // 设置最大连接数 表示当连接池中的连接数少于最大连接数时，会自动扩容，直到达到最大连接数时，多余进入等待队列
        comboPooledDataSource.setMaxPoolSize(50);


//        Connection connection = comboPooledDataSource.getConnection();
//
//        System.out.println("连接成功!");
//        connection.close();

        // 测试连接 5000 次数据库
        long start = System.currentTimeMillis();
        for(int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();

            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);  // 428

    }

    // 第二种方式 使用配置文件模板完成
    // 将 c3p0 提供的  c3p0-config.xml(一定要这个名字) 文件拷贝到src目录下
    // 该文件指定了连接数据库和连接池 的相关参数
    @Test
    public void c3p0_2() throws SQLException {
//        将配置文件中的配置名写入构造器
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("mysql");
//        Connection connection = comboPooledDataSource.getConnection();
//
//        System.out.println("连接成功");
//        JDBCUtils.close(null,null,connection);
        // 测试连接 5000 次数据库
        long start = System.currentTimeMillis();
        for(int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();

            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);  // 499
    }


}
