package com.lbw.jdbc.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils_Use {

    @Test
    public void dml() {
        // 获取连接
        Connection connection = null;
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement =null;
        // 编写 sql 语句
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"王五");
            preparedStatement.setInt(2,3);
            int i = preparedStatement.executeUpdate();
            System.out.println(i > 0 ? "修改成功" : "修改失败");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }

    }
    @Test
    public void select() {
        Connection connection = null;
        String sql = "select * from actor";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(id + "\t" + name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(resultSet,preparedStatement,connection);
        }

    }
}
