package com.date_;

import java.time.Instant;
import java.util.Date;

public class Instant_ {
    public static void main(String[] args) {
//        Instant : 第三代日期类的时间戳对象
//        通过静态方法 now() 来获取当前时间戳Instant对象
        Instant instant = Instant.now();
        System.out.println(instant);
//        通过 Date 的静态方法 from() 实现将 Instant 转换为 Date
        Date date = Date.from(instant);
        System.out.println(date);
//        在通过 Date 方法 ： toInstant() 实现将 Date 对象转换为 Instant对象
        Instant instant2 = date.toInstant();
        System.out.println(instant2);

    }
}
