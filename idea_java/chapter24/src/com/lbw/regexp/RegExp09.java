package com.lbw.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 反向引用
public class RegExp09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String content = "123155135411111233254";
        //  匹配两个相同的数字
        String regex = "(\\d)\\1";
        //  匹配5个两个相同的数字
        regex = "(\\d)\\1{4}";

        //  匹配一个四位数，要求个位与千位一致，十位与百位一致
        regex = "(\\d)(\\d)\\2\\1";



        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println("请输入商品编号 ：");
        String content2 = scanner.nextLine();
        regex = "^\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        System.out.println(Pattern.matches(regex, content2));

    }
}
