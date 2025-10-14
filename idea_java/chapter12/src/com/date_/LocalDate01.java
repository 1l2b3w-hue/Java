package com.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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


//        格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(date);
        System.out.println(format);

//        提供 plus 和 minus 方法来对当前时间进行加减
        LocalDateTime localDateTime = date.plusDays(890); // 增加890
        String format1 = dateTimeFormatter.format(localDateTime);
        System.out.println(format1);

        LocalDateTime localDateTime1 = date.minusMinutes(3456); // 查看3456分钟前的时间
        String format2 = dateTimeFormatter.format(localDateTime1);
        System.out.println(format2);
    }
}
