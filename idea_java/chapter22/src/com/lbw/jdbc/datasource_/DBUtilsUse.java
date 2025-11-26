package com.lbw.jdbc.datasource_;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBUtilsUse {

    // apache 的 DBUtils + druid 实现 crud

    @Test
    public void testQuery() throws SQLException {
        // 获取连接
        Connection connection = JDBCUtilsByDruid.getConnection();
        // 引入 BDUtils 相关的 jar 包 : commons-dbutils-1.8.1.jar，添加配置文件
        // 创建 QueryRunner 对象
        QueryRunner queryRunner = new QueryRunner();
        // 通过 QueryRunner 对象执行相关方法获取 ArrayList 结果集
        String sql = "select * from actor where id = ?";
        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class),1);
        // 解读 ：
        // query 会在执行sql语句后，将查询到的 ResultSet 结果集 封装到 ArrayList 集合中，并返回该集合
        // 参数 ： connection ： 数据库的连接， sql ： 执行的sql语句
        // new BeanListHandler<>(Actor.class) : 将 ResultSet 转变成 Actor 然后封装到 ArrayList中，其中
        //  Actor.class 是底层通过反射机制了解 Actor 到底有哪些属性，然后进行封装
        // 后面的参数是会传递到 sql 语句的 ？ 号, 如果sql语句没有 ？ 则不要设置参数
        // 底层获取的 ResultSet 方法将会在query 方法中关闭，还会关闭 PreparedStatement (底层还是会创建这个查询的)

        System.out.println(list);

        JDBCUtilsByDruid.close(null,null,connection);
    }

    // apache 的 DBUtils + Druid 的单行查询(单个对象)
    @Test
    public void testQuerySingle() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id = ?";
        // 如果查不到，将会返回 null
        Actor query = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 10);
        JDBCUtilsByDruid.close(null,null,connection);
        if(query != null) {
            System.out.println(query);
        } else {
            System.out.println("id 不存在！");
        }


    }

    // apache 的 DBUtils + Druid 的单行单例查询(单个对象)
    @Test
    public void testQuerySingleCol() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select name from actor where id = ?";
        // 只会对查询的字段进行赋值，其余将会赋null
//        Actor query = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 1);
        Object query = queryRunner.query(connection, sql, new ScalarHandler<>(), 1);

        JDBCUtilsByDruid.close(null,null,connection);
        if(query != null) {
            System.out.println(query);
        } else {
            System.out.println("id 不存在！");
        }
    }

    // apache 的 DBUtils + Druid
    @Test
    public void testDML() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
//        String sql = "update actor set name = ? where id = ?";
//        int affected = queryRunner.update(connection, sql, "周星驰", 1);
//        String sql = "insert into actor values(null,?,?,?,?)";
//        int affected = queryRunner.update(connection, sql, "李四", "男", "2012-10-10", "116");
        String sql = "delete from actor where id = ?";
        int affected = queryRunner.update(connection, sql, 100);
        System.out.println(affected > 0 ? "执行成功" : "执行未影响到表");
        JDBCUtilsByDruid.close(null,null,connection);


    }

}
