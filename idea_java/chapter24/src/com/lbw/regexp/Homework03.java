package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//对一个url进行解析
//https://www.sohu.com:8080/abc/index.htm
//a)要求得到协议是什么？http
//b)域名是什么？www.sohu.com
//c)端口是什么？8080
//d)文件名是什么？index.htm
public class Homework03 {
    public static void main(String[] args) {
       String url =  "https://www.sohu.com:8080/abc/index.html";

       String regex = "^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)[\\w-/]*/([\\w.]+)$";

       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(url);
       if (matcher.matches()) {
           System.out.println("协议" + matcher.group(1));
           System.out.println("域名" + matcher.group(2));
           System.out.println("端口" + matcher.group(3));
           System.out.println("文件名" + matcher.group(4));
       }
       else {
           System.out.println("匹配失败");
       }










//        String pact = null;
//        String domain = null;
//        String file = null;
//        String port = null;
//        String url = "https://www.sohu.com:8080/abc/index.html";
//
//        String regex = "^[a-z]+";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(url);
//        matcher.find();
//        pact = matcher.group(0);
//        System.out.println("协议：" + pact);
//
//        regex = "[a-zA-Z.]+(com|cn)";
//        pattern = Pattern.compile(regex);
//        matcher = pattern.matcher(url);
//        matcher.find();
//        domain = matcher.group(0);
//        System.out.println("域名：" + domain);
//
//
//        regex = ":\\d+";
//        pattern = Pattern.compile(regex);
//        matcher = pattern.matcher(url);
//        matcher.find();
//        port = matcher.group(0).replaceAll(":","");
//        System.out.println("端口：" + port);
//
//
//        regex ="[a-zA-Z.]+$\\b";
//        pattern = Pattern.compile(regex);
//        matcher = pattern.matcher(url);
//        matcher.find();
//        file = matcher.group(0);
//        System.out.println("文件名：" + file);
    }
}
