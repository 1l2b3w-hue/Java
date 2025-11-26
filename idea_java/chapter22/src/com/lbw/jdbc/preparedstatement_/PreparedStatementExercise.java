package com.lbw.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class PreparedStatementExercise {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
//        1.创建 admin表
//        2.使用PreparedStatement添加5条数据
//        3.修改 tom 的记录，将name 改成 king
//        4.删除一条的记录
//        5.查询全部记录，并显示在控制台

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\mysql.properties");
        properties.load(fileInputStream);
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("class");

        Class<?> aClass = Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        String create_sql = "create table admin (`name` varchar(32), pwd varchar(32))";
        connection.prepareStatement(create_sql).executeUpdate();

        // 添加
        String insert_sql = "insert into admin values(?,?),(?,?),(?,?),(?,?),(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert_sql);
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        for(int i = 0; i < 5; i++) {
            System.out.print("请输入添加的名字:");
            String name = scanner.nextLine();
            System.out.print("请输入添加的密码:");
            String pw = scanner.nextLine();
            preparedStatement.setString(n ,name);
            preparedStatement.setString(n + 1,pw);
            n += 2;
        }
        System.out.println();
        int row2 = preparedStatement.executeUpdate();
        System.out.println( row2 >4 ? "添加成功" : "添加失败");

        // 修改
        String update_sql = "update admin set name = ? where name = ?";
        PreparedStatement preparedStatement1 = connection.prepareStatement(update_sql);
        preparedStatement1.setString(1,"king");
        preparedStatement1.setString(2,"tom");
        int row3 = preparedStatement1.executeUpdate();
        System.out.println( row2 >4 ? "修改成功" : "修改失败");

        // 删除
        String delete_sql = "delete from admin where name = ?";
        PreparedStatement preparedStatement2 = connection.prepareStatement(delete_sql);
        preparedStatement2.setString(1,"mary");
        int row4 = preparedStatement2.executeUpdate();
        System.out.println(row4 > 0 ? "删除成功" : "删除失败");

        // 查看
        String select_sql = "select * from admin";
        PreparedStatement preparedStatement3 = connection.prepareStatement(select_sql);
        ResultSet resultSet = preparedStatement3.executeQuery();
        while(resultSet.next()) {
            String name = resultSet.getString(1);
            String pw = resultSet.getString(2);
            System.out.println(name + "\t" + pw);
        }

        resultSet.close();
        preparedStatement3.close();
        preparedStatement2.close();
        preparedStatement1.close();
        preparedStatement.close();
        connection.close();
        fileInputStream.close();
        scanner.close();


    }
}
