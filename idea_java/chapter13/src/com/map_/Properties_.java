package com.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {

        Properties propertise = new Properties();

        // 增加 k 和 v 不能为空
//        propertise.put(null,100);
//        propertise.put("jack",null);

        propertise.put("john",100);
        propertise.put("jack",100);
        propertise.put("smith",100);
        propertise.put("smith",80); // 会替换100

        System.out.println(propertise);

        // 通过 get 方法获取 k 的对应值
        System.out.println(propertise.get("john"));
        System.out.println(propertise.get("smith"));
        // getProperty ：用于获取配置文件中指定键（key）对应的字符串值（value） 的核心方法
        System.out.println(propertise.getProperty("smith"));

        // 删
        propertise.remove("john");
        System.out.println(propertise);

        // 改
        propertise.put("jack","hello");
        System.out.println(propertise);
    }
}
