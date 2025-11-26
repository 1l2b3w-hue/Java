package com.lbw.jdbc.batch_;

import com.lbw.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 批处理
public class Batch_ {

    @Test
    public void noBatch() throws SQLException {
        // 没有批处理执行 5000 条 sql 语句
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < 5000;i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }

        long end = System.currentTimeMillis();
        System.out.println("总耗时为" + (end - start)); // 2449
        JDBCUtils.close(null,preparedStatement,connection);
    }

    @Test
    public void batch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();
        for(int i = 0; i < 5000; i++) {
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"666");
            preparedStatement.addBatch();
            /*
            public void addBatch() throws SQLException {
                try {
                    synchronized(this.checkClosed().getConnectionMutex()) {
                        QueryBindings queryBindings = ((PreparedQuery)this.query).getQueryBindings();
                        queryBindings.checkAllParametersSet(); // 检查 添加的占位符
                        this.query.addBatch(queryBindings.clone());
                        // 存放sql语句 到 query 的 batchArgs(一个 ArrayList 集合) 中
                    }
                } catch (CJException var6) {
                    throw SQLExceptionsMapping.translateException(var6, ((StatementImpl)this).getExceptionInterceptor());
                }
            }


             */

            if((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时 " + (end - start)); // 101
        JDBCUtils.close(null,preparedStatement,connection);
    }

}
