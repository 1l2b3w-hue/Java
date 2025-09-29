package com.encapsulation;

import java.util.Scanner;
public class Account {
    private String name;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
       setName(name);
       setBalance(balance);
       setPassword(password);
    }

    public void setName(String name) {
        int len = name.length();
        if(len == 2 || len == 3 || len == 4) {
            this.name = name;
        }
        else {
            System.out.println("名字要求2位3位或者4位，目前名字不符合，赋默认值 ： user");
            this.name = "user";
        }

    }
    public void setBalance (double balance) {
        if(balance > 20) {
            this.balance = balance;
        }
        else {
            System.out.println("余额要求大于20，目前不大于20，赋默认值：-1");
            this.balance = -1;
        }
    }
    public void setPassword(String password) {
        if(password.length() == 6) {
            this.password = password;
        }
        else{
            System.out.println("密码要求位数为6，目前密码不符合，赋默认值 ： 123456");
            this.password = "123456";
        }
    }

    public void info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码进行验证：");
        String password = sc.next();
        if(password.equals(this.password)){
            System.out.println("当前信息为 ：");
            System.out.println("姓名 ： " + this.name +
                    " 余额 " + this.balance + " 密码 " + this.password);
        }
        else {
            System.out.println("密码错误，无法查看信息");
        }
    }
}
