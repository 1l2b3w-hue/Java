package com.lbw.jdbc;



import com.mysql.cj.jdbc.Driver;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

// 第一个简单的jdbc程序，完成简单操作
public class jdbc01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 前置工作 ： 在项目下创建一个文件夹
        // 将 mysql.jar 拷贝到该目录下，点击添加为库 添加到项目中
        //1. 注册驱动 因为 jar 是 8.0 的推荐 Driver 是com.mysql.cj.jdbc.Driver，避免类过时报错
        // 静态获取 Driver 对象
        //Driver driver = new Driver();
        // 反射获取 Driver 对象
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)aClass.getConstructor().newInstance();

        //2. 获取连接
        /*
        * jdbc:mysql://localhost:3306/hsp_db02
        * jdbc:mysql:// 一个协议,固定写法
        * localhost:3306 数据库登录 ip 和 端口号
        * hsp_db02 : 使用哪个数据库
        * */
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties(); // 存放用户名与密码
        properties.setProperty("user", "root");
        properties.setProperty("password", "lbw");
        // 使用 driver 的connect 方法获取到一个连接，
        // 方法两个参数 ： 一个就是描述连接哪个数据库的字符串，
        // 另一个就是存放了用户名与密码的 Properties 集合
        Connection connect = driver.connect(url, properties);// 根据给定url连接数据库
        //3. 执行sql
        // 通过 statement 对象的 executeUpdate 方法执行sql语句
        // 返回执行后影响的行数，
        Statement statement = connect.createStatement();
        String sql = "insert into actor value(null,'李四','男','2010-10-10','1234')";
        //String sql = "update actor set phone = '1234' where id = 2";
//        String sql = "delete from actor where id = 2";
        int row = statement.executeUpdate(sql);
        System.out.println( row > 0 ? "成功" : "失败");
        //4. 释放资源

        statement.close();
        connect.close();
    }

}
