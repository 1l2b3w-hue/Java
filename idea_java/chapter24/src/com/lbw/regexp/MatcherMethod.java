package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {
    public static void main(String[] args) {
        String content = "hello edu jack tom hello smith hello";
        String regex = "hello";

        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(content);

        while (matcher.find()) {
            System.out.println("===============");
            System.out.println(matcher.start()); // 返回 符合规则的子串开始索引
            System.out.println(matcher.end()); // 返回 符合规则的子串开始索引 + 1，子串长度
        }
        System.out.println(matcher.matches()); // 整体去查看

        // 将 hello 替换成 hspedu
        System.out.println(matcher.replaceAll("hspedu"));
    }
}
