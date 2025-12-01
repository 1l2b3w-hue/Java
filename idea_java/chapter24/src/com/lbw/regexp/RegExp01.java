package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

// 演示字符匹配符的使用
public class RegExp01 {
    public static void main(String[] args) {
        String content = "a11c8abcABC";

//        String regex = "[a-z]";
//        String regex = "[A-Z]";
//        String regex = "[0-9]";
//        String regex = "abc"; // 默认区分大小写
//        String regex = "(?i)abc"; // 不区分大小写
//        String regex = "[^a-z]"; // 1 1 8
        String regex = "[^a-z]{2}"; // 11

//        创建 Pattern 对象时，指定 CASE_INSENSITIVE， 表示匹配时不区分字母大小写
        Pattern pattern = Pattern.compile(regex,CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
