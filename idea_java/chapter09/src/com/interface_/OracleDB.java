package com.interface_;
//B 实现接口连接 Oracle
public class OracleDB implements DBInterface {
    public void connect() {
        System.out.println("连接Oracle数据库");
    }
    public void close() {
        System.out.println("关闭连接Oracle数据库");
    }
}
