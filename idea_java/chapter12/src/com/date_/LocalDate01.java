package com.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate01 {
    public static void main(String[] args) {
//        使用now() 返回表示当前时间日期的 对象
        LocalDateTime date = LocalDateTime.now(); // 日期 + 时间
        System.out.println(date);
        System.out.println("年 :" + date.getYear());
        System.out.println("月 :" + date.getMonth()); // 英文
        System.out.println("月 :" + date.getMonthValue()); // 数值
        System.out.println("日 :" + date.getDayOfMonth());
        System.out.println("时 :" + date.getHour());
        System.out.println("分钟 :" + date.getMinute());
        System.out.println("秒 :" + date.getSecond());

        LocalDate date1 = LocalDate.now(); // 日

        LocalTime date2 = LocalTime.now(); // 时间
    }
}
