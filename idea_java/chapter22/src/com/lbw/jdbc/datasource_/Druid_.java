package com.lbw.jdbc.datasource_;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class Druid_ {

    @Test
    public void testDruid() throws Exception {
        //1. 加入 druid.jar 包，加载成库文件
        //2. 加入配置文件(名字随意)，放到src目录下
        //3. 创建 properties 对象， 读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));

        //4. 创建数据库连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        Connection connection = dataSource.getConnection();
//
//        System.out.println("连接成功！");
//        connection.close();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 5000000; i++) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
