package com.lbw.regexp;

import java.util.regex.Pattern;

//定电子邮件规则为
//1.只能有一个@
//@前面是用户名，可以是a-zA-Z0-9_-字符
//@后面是域名，并且域名只能是英文字母，比如sohu.com或者tsinghua.org.cn
//4.写出对应的正则表达式，验证输入的字符串是否为满足规则
public class Homework01 {
    public static void main(String[] args) {
        String regex = "[\\w-]+@[a-z.]+(com|cn)$";
        String str1 = "a_bc@tsinghua.org";
        if(Pattern.matches(regex,str1)) {
            System.out.println("满足规则");
        }
        else {
            System.out.println("不满足规则");
        }
    }
}
