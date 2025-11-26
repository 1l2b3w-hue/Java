package com.lbw.jdbc.myjdbc;

public class Test {
    public static void main(String[] args) {
        jdbcinterface jdbc1 = new Mysql();
        jdbc1.connection(); // 使用动态绑定
        jdbc1.crud();
        jdbc1.close();
    }
}
