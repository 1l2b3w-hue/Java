package com.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date(); // 获取当前系统时间
//        默认输出的日期格式是国外的方式，因此需要对格式进行转换
        System.out.println(date);

//        通过指定毫秒数来获取时间
        Date date1 = new Date(111119999);
        System.out.println(date1);

//        创建simpleDateFormat 对象，可以指定相应的格式
//        格式使用的字母都是规定好的，不能乱来
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String format = simpleDateFormat.format(date); // 使用format方法实现转换成对应格式
        System.out.println(format);

//        将一个格式化字符串转换为对应的Date
        String format1 = "1996年12月12日 12:12:12 星期一"; // 必须符合simple...对应的格式
        Date parse = simpleDateFormat.parse(format1);
        System.out.println(parse); // 还是按照国外的格式输出
    }
}
