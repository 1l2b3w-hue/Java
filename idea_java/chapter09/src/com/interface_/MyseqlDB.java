package com.interface_;

// A 实现接口连接Mysql
public class MyseqlDB implements DBInterface{
    public void connect() {
        System.out.println("连接mysql数据库");
    }
    public void close() {
        System.out.println("关闭连接mysql数据库");
    }

}
