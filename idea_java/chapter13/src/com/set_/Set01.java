package com.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {

//        实现了 set 接口的类对象，不能存放重复元素
//        添加和取出的顺序并不一致，但取出的顺序是固定的
        Set set = new HashSet();
        set.add("John");
        set.add("Jack");
        set.add("smith");
        set.add("lucy");
        set.add(null);
        set.add(null);
        System.out.println("set: " + set);

//        遍历
        Iterator iterator = set.iterator();
//        迭代器
        System.out.println("===== 迭代器 =====");
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("===== 增强for() =====");
        for(Object o : set) {
            System.out.println(o);
        }


    }
}
