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

public class C3P0_1 {

    @Test
    public void c3p0_readFile() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("mysql");

        Connection connection = comboPooledDataSource.getConnection();

        System.out.println("读取配置文件获取链接成功！");
        JDBCUtils.close(null,null,connection);

    }

    @Test
    public void c3p0_writeParameter() throws IOException, PropertyVetoException, SQLException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String driver = properties.getProperty("class");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setDriverClass(driver);

        Connection connection = comboPooledDataSource.getConnection();

        System.out.println("写入参数获取连接成功！");
        JDBCUtils.close(null,null,connection);

    }
}
