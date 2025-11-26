package com.lbw.jdbc.datasource_;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class JDBCUtilsByDruidUse {

    @Test
    public void test() {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            String sql = "select * from actor";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                Date birthday = resultSet.getDate(4);
                String phone = resultSet.getString(5);

                System.out.println(id + "\t" + name + "\t" + sex + "\t" + birthday + "\t" + phone + "\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                JDBCUtilsByDruid.close(resultSet,preparedStatement,connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    //将 resultSet 封装进 arraylist
    @Test
    public  void testResultSetToArrayList() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> actors = new ArrayList<>();
        try {
            connection = JDBCUtilsByDruid.getConnection();
            String sql = "select * from actor";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sex = resultSet.getString(3);
                LocalDateTime birthday = resultSet.getDate(4).toLocalDate().atStartOfDay();
                String phone = resultSet.getString(5);
                actors.add(new Actor(id,name,sex,birthday,phone));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                JDBCUtilsByDruid.close(resultSet,preparedStatement,connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(actors); // 即使连接被关闭，还是可以在程序中继续使用
    }
}
