package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystem {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String choice = " ";
//        零钱通明细实现 ： 1.数组存放；2.对象存放；3.字符串拼串
        String details ="------------零钱通明细-------------";

//        收益入账实现 ：
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        消费
        String address = "";
        do {
            System.out.println("\n------------零钱通菜单-------------");
            System.out.println("\t\t 1 零钱通明细");
            System.out.println("\t\t 2 收益入账");
            System.out.println("\t\t 3 消费");
            System.out.println("\t\t 4 退\t出");
            System.out.print("请选择(1-4):");
            choice = scanner.next();
            switch(choice) {
                case "1" :
                    System.out.println(details);
                    break;
                case "2" :
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
//                    实现一个收益金额校验
                    if(money <= 0) {
                        System.out.println("金额输入错误！,收益金额要大于0");
                        break;
                    }
                        balance += money;
                        date = new Date();
//                    拼串：
                        details += "\n" + "收益入账\t+" + money + "\t" +
                                sdf.format(date) + "\t余额：" + balance;
                    break;
                case "3" :
                    System.out.println("消费场所 ：");
                    address = scanner.next();
                    System.out.println("消费金额：");
//                    需要完成一个金额的验证，看又这么多钱没有
                    money = scanner.nextDouble();
                    if(money > balance || money <=0 ) {
                        System.out.println("你的余额不足" + "或消费金额范围应该在0~" + balance);
                        break;
                    }
                        balance -= money;
                        date = new Date();
                        details += "\n" +address + "\t-" + money + "\t" +
                                sdf.format(date) + "\t余额：" + balance;
                    break;
                case "4" :
                    char c1;
                    do{
                        System.out.print("你确定推出吗？(y/n):");
                        c1 = scanner.next().charAt(0);
                        if(c1 == 'y'||c1 == 'n') {
                            break;
                        }
                    }while(true);
                    if(c1 == 'y') {
                        System.out.println("退出系统");
                        loop = false;
                    }
                    break;
                default :
                    System.out.println("输入有误，请重新输入！");
            }

        } while (loop);
        System.out.println("零钱通系统退出！");
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("------------零钱通菜单-------------");
//        System.out.println("\t\t 1 零钱通明细");
//        System.out.println("\t\t 2 收益入账");
//        System.out.println("\t\t 3 消费");
//        System.out.println("\t\t 4 退\t出");
//        while(true) {
//            System.out.print("请选择(1-4):");
//            int choice = scanner.nextInt();
//            switch(choice) {
//                case 1 :
//                    System.out.println("------------零钱通明细-------------");
//                    System.out.println("收益入账 +100.0 2021-01-21 17:41\t余额:100.0");
//                    System.out.println("收益入账 +500.0 2021-01-21 17:41\t余额:600.0");
//                    System.out.println("真功夫 -20.0  2021-01-21 17:41\t余额:580.0");
//                    break;
//                case 2 :
//                    System.out.println("------------收益入账-------------");
//                    System.out.println("收益入账 +100.0 2021-01-21 17:41\t余额:100.0");
//                    System.out.println("收益入账 +500.0 2021-01-21 17:41\t余额:600.0");
//                    break;
//                case 3 :
//                    System.out.println("------------消费-------------");
//                    System.out.println("真功夫 -20.0  2021-01-21 17:41\t余额:580.0");
//                    break;
//                case 4 :
//                    System.out.println("退出系统");
//                    break;
//                default :
//                    System.out.println("输入错误，请重新输入！！");
//            }
//            if(choice == 4) {
//                break;
//            }
//        }
//    }
}
