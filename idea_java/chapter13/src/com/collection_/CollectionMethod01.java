package com.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

//        add() 添加单个元素 , 存在自动装箱过程，
        list.add("a"); // 类似于 list.add(new String(a))
        list.add(100);
        list.add(true);
        System.out.println("list: " + list);

//        remove() : 删除单个元素 (两种形式 ： 删除指定索引(返回删除对象)，删除指定对象(返回true false))
//        System.out.println(list.remove(0));
        System.out.println(list.remove(true));
        System.out.println("list: " + list);

//        contains() : 查找元素是否存在
        System.out.println(list.contains("b"));

//        size() : 获取元素个数
        System.out.println(list.size());

//        isEmpty() : 检查集合是否为空
        System.out.println(list.isEmpty());

//        clear() : 清空集合
        list.clear();
        System.out.println("list: " + list);

//        addAll() : 添加多个元素 ，接受实现了Collection接口的类
        ArrayList list1 = new ArrayList();
        list1.add("红楼梦");
        list1.add("三国演义");
        list.addAll(list1);
        System.out.println("list: " + list);


//        containsAll() : 查找多个元素是否存在
        System.out.println(list.containsAll(list1));


//        removeAll() : 删除多个元素
        list.removeAll(list1);
        System.out.println("list: " + list);

    }
}
