package com.map_;

import java.util.*;

public class Mapfor_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘令博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

//        遍历方式 : 1.通过 keySet() 获取所有 key, 再通过 key 获取所有value
        Set set = map.keySet();
        System.out.println("===== 增强for =====");
        for (Object o : set) {
            System.out.println(o + "-" + map.get(o));
        }
        System.out.println("===== 迭代器 =====");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o + "-" + map.get(o));
        }

//        获取所有的 value 来遍历,但注意的是 : 无法通过 value 获取 key
        Collection values = map.values();
        System.out.println("===== 增强for =====");
        for (Object o : values) {
            System.out.println(o);
        }
        System.out.println("===== 迭代器 =====");
        Iterator iterator2 = values.iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

//        通过 EntrySet 获取所有的键值对，进行遍历
        Set set1 = map.entrySet();
        System.out.println("===== 增强for =====");
        for (Object o : set1) {
//            System.out.println(o);
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("===== 迭代器 =====");
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry)(iterator1.next());
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
