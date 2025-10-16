package com.list_;

import java.util.*;

public class ListFor {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new Vector();
        List list  = new LinkedList();
        list.add("Jack");
        list.add("tom");
        list.add("鱼香肉丝");
        list.add("北京烤鸭");
        System.out.println("=== 迭代器 ===");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
        System.out.println("=== 增强for ===");
        for(Object obj : list){
            System.out.println(obj);
        }

        System.out.println("=== 普通for ===");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
