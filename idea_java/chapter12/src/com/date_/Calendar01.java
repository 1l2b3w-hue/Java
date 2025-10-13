package com.date_;

import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {
//        Calendar 是一个抽象类，构造器是受保护的，可通过getInstance 获取实例
//        提供大量的字段和方法使用
        Calendar calendar= Calendar.getInstance();
        System.out.println(calendar);
//        获取日历对象的字段
        System.out.println("年 ：" + calendar.get(Calendar.YEAR));
//        月 要加1，从零开始
        System.out.println("月 ：" + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("日 :" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时 ：" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分钟 ：" + calendar.get(Calendar.MINUTE));
        System.out.println("秒 :" + calendar.get(Calendar.SECOND));
//        Calendar不提供格式化的类，需要自行组合
        System.out.println(calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" +
                calendar.get(Calendar.DAY_OF_MONTH) + " "+ calendar.get(Calendar.HOUR_OF_DAY) + ":" +
                calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
    }
}
