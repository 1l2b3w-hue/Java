package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 分组
public class RegExp04 {
    public static void main(String[] args) {
        String content = "hanshunping s7789 nn1189han";

//        非命名分组
//        matcher.group(0) : 得到匹配的字符串
//        matcher.group(1) : 得到匹配的字符串的第一个分组内容
//        matcher.group(2) : 得到匹配的字符串的第一个分组内容....
//        String regex = "(\\d\\d)(\\d\\d)";

//        命名分组
        String regex = "(?<g1>\\d\\d)(?<g2>\\d\\d)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) {
            System.out.println(matcher.group(0));
//            System.out.println("第一个分组的内容：" + matcher.group(1));
//            System.out.println("第二个分组的内容：" + matcher.group(2));
            System.out.println("第一个分组的内容：" + matcher.group("g1"));
            System.out.println("第二个分组的内容：" + matcher.group("g2"));

        }
    }
}
