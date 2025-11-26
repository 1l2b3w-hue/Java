package com.lbw.jdbc.transaction_;

import com.lbw.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction_ {

    @Test
    public void noTransaction() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils.getConnection();
            String sql = "update account set money = money - 100 where id = 100";
            String sql2 = "update account set money = money + 100 where id = 200";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            // 这里自己添加一个错误
            int i = 1 / 0;

            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }

    @Test
    public void transaction() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);// 关闭自动提交，相当于事务的开始点
            String sql = "update account set money = money - 100 where id = 100";
            String sql2 = "update account set money = money + 100 where id = 200";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            //int i = 1 / 0;

            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            connection.commit(); // 提交
        } catch (SQLException e) {
            try {
                connection.rollback(); // 默认回滚到事务开始位置
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }


    }

}
