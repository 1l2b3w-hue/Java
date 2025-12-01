package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 非贪婪匹配
public class RegExp06 {
    public static void main(String[] args) {
        String content = "hello11111";
//        String regex = "\\d+";// 默认贪婪匹配，尽可能多匹配字符
        String regex = "\\d+?";// 后加 ？ ,尽可能少的匹配字符
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

    }

}
