package com.lbw.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 演示 正则表达式的威力
public class Regexp_ {

    public static void main(String[] args) {
        // 假设从网页中获取到一段文字(爬虫获取)
        String content = "当编辑并运行一个Java程序时，需要同时涉及到这四种方面。" +
                "使用文字编辑软件（例如记事本、写字板、UltraEdit等）或集成开发环境" +
                "（Eclipse、MyEclipse等）在Java源文件中定义不同的类，通过调用类（" +
                "这些类实现了Java API）中的方法来访问资源系统，把源文件编译生成一种二进制中间码，" +
                "存储在class文件中，然后再通过运行与操作系统平台环境相对应的Java虚拟机来运行class文件" +
                "，执行编译产生的字节码，调用class文件中实现的方法来满足程序的Java API调用";

        // 提取这段文字中的 所有单词
        // 传统方式 ： 遍历循环，效率低下
        // 正则表达式 ：
        // 1. 创建一个 Pattern 对象(模式对象，一个正则表达式的对象)
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        // 2. 获取匹配器对象
        // 理解 ： matcher 匹配器按照 pattern 的模式/样式, 到content 文本中去匹配
        // 找到返回正，找不到返回false
        Matcher matcher = pattern.matcher(content);
        // 3. 循环匹配
        while(matcher.find()) {
            // 匹配内容 放入 matcher.group中
            System.out.println("找到:" + matcher.group());
        }
    }
}
