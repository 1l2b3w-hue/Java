package com.lbw.jdbc.myjdbc;
/*
* 模拟 jdbc 接口
*/
public interface jdbcinterface {
    public Object connection(); // 实现连接数据库功能
    public void crud(); // 增删改查
    public void close(); // 关闭连接数据库
}
