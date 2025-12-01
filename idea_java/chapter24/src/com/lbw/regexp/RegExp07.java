package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 应用
public class RegExp07 {
    public static void main(String[] args) {
        String content = "韩顺平教育";
//        验证汉字
        String regex = "^[\\u4E00-\\u9FA5]+$";

        content = "123890";
//        验证邮编 ：开头 1-9 ，六位数字
        regex = "^[1-9]\\d{5}$";

        //验证QQ号 : 1-9 开头的5 - 10位数
        content = "123456789";
        regex = "^[1-9]\\d{4,9}$";

        // 验证手机号 : 13,14,15,18 开头的11位数
        content = "134567892";
        regex = "^(?:13|14|15|18)\\d{9}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}
