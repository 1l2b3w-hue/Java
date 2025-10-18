package com.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
//        put() : 添加元素
        map.put("abc","123");
        map.put("abc","韩顺平");
        map.put("纸嫁衣","聂莫琪");
        map.put(null,"聂莫琪");

//        remove() : 删除 , 指定 key 或 key 和 value 删除
        map.remove(null);
        System.out.println(map);

//        get() : 根据指定的 Key 返回对应的 value
        System.out.println(map.get("纸嫁衣"));

//        set() : 获取当前的元素个数
        System.out.println(map.size());

//        isEmpty() : 判断个数是否为0
        System.out.println(map.isEmpty());

//        clear() : 清空所有的键值对
//        map.clear();
//        System.out.println(map);

//        containsKey() : 查找键是否存在
        System.out.println(map.containsKey("ttt"));
    }
}
