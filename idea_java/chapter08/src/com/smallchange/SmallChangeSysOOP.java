package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    String detail  = "------------零钱通明细-------------";
    double balance;
    double money;
    Date date;
    String address;
    boolean loop = true;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Scanner sc = new Scanner(System.in);
    public void menu() {
       do{
           System.out.println("------------零钱通菜单-------------");
           System.out.println("\t\t 1 零钱通明细");
           System.out.println("\t\t 2 收益入账");
           System.out.println("\t\t 3 消费");
           System.out.println("\t\t 4 退\t出");
           System.out.println("请输入你的选择：");
           String choice = sc.next();
           switch(choice) {
               case "1" : details(); break;
               case "2" : profits(); break;
               case "3" : pay();break;
               case "4" : exit();break;
               default :
                   System.out.println("输入错误");
           }

       }while(loop);
        System.out.println("退出零钱通");
    }
    //零钱通明细
    public void details() {
        System.out.println(detail);
    }

    public void profits() {
        System.out.println("请输入收益金额");
        money = sc.nextDouble();
        if(money <= 0) {
            System.out.println("输入的收益金额有误！");
            return;
        }
        balance += money;
        date = new Date();
        detail +=  "\n收益入账\t+" + money + "\t" + sdf.format(date) +
                "\t余额" + balance ;

    }

    public void pay() {
        System.out.println("请输入消费地址");
        address = sc.next();
        System.out.println("请输入消费金额");
        money = sc.nextDouble();
        if(money <= 0 || money > balance) {
            System.out.println("输入的消费金额有误!请检查金额是否大于余额或者金额为负数");
            return;
        }
        balance -= money;
        date = new Date();
        detail += "\n"+ address + "\t\t-" + money + "\t" + sdf.format(date) +
                "\t余额" + balance ;

    }

    public void exit() {
        while(true) {
            System.out.println("你确定推出吗？y/n");
            String c1 = sc.next();
            if(c1.equals("y")) {
                loop = false;
                break;
            }
            else if(c1.equals("n")){
                break;
            }
        }
    }

}
