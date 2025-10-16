package com.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("赵敏");
//      add(int index,Object obj) : 在index位置加上obj元素
        list.add(1,"韩顺平");
        System.out.println(list);

//        addAll(int index,Collection col) : 在index位置添加col的所有元素
        List list1 = new ArrayList();
        list1.add("Jack");
        list1.add("Tom");
        list.addAll(2,list1);
        System.out.println(list);

//        get(int index) : 返回指定索引的元素

//        indexOf(Object obj) : 返回obj元素在集合中第一次出现的索引
        System.out.println(list.indexOf("Tom"));

//        lastIndexOf(Object obj) : 返回obj在集合中最后出现的索引
        list.add("韩顺平");
        System.out.println(list.indexOf("韩顺平"));
        System.out.println(list.lastIndexOf("韩顺平"));

//        remove(int index) : 删除指定索引的元素并返回一个布尔值
        System.out.println(list.remove("张三丰"));
        System.out.println(list);

//        set(int index,Obejct obj) : 设置index位置上的元素为obj(替换),索引必须存在
        list.set(3,"张无忌");
        System.out.println(list);

//        subList(int startIndex,int endIndex) : 返回 [startIndex , endIndex) 的子集合
        List list2 = list.subList(1,3);
        System.out.println(list2);
    }
}
