package com.lbw.dao_.dao;

import com.lbw.dao_.utils_.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// 开发BasicDAO 是其他DAO的父类
public class BasicDAO<T> {

    private QueryRunner qr = new QueryRunner();

    // 用来执行 dml 操作
    public int update(String sql, Object... parameters) {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            int update = qr.update(connection, sql, parameters);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    // 返回多个对象(即查询结果是多行)，针对任意表

    /**
     *
     * @param sql
     * @param clazz  传入一个类的Class对象，比如 ： Actor.class
     * @param parameters
     * @return
     */
    public List<T> selectMulLine (String sql, Class<T> clazz, Object... parameters) {
        Connection connection = null;

        connection = JDBCUtilsByDruid.getConnection();
        try {
            List<T> querys =
                    qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
            return querys;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }

    }

    // 查询单行结果的方法
    public T selectSingle(String sql,Class<T> clazz, Object... parameters) {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            T query = qr.query(connection, sql, new BeanHandler<T>(clazz), parameters);
            return query;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    // 查询单行单列的方法
    public Object queryScalar(String sql, Object... parameters) {
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            Object query = qr.query(connection, sql, new ScalarHandler(), parameters);
            return query;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

}
