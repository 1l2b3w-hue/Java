package com.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
//        使用无参构造器创建 treeMap 还是无序的
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            public int compare(Object o1, Object o2) {
//                return ((String)o1).compareTo((String)o2);
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("kristina","克瑞斯提诺");
        treeMap.put("smith","斯密斯");
        treeMap.put("hsp","韩顺平"); // hsp 无法加入 ，但 韩顺平会将汤姆替换


        System.out.println(treeMap);
    }
}
