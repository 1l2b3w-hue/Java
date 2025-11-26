package com.lbw.jdbc.myjdbc;

public class Mysql implements jdbcinterface{
    @Override
    public Object connection() {
        System.out.println("连接 MySQL 数据库");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 MySQL 数据库的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 MySQL 的连接");
    }
}
