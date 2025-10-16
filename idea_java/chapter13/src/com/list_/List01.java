package com.list_;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
//       List 集合的类的元素是有序的(添加元素和取出顺序一致)，并可以重复
        List list = new ArrayList();
        list.add("Jack");
        list.add("Tom");
        list.add("Smith");
        list.add("Jack");
        list.add("Jack");
        System.out.println(list);

//        List 集合中每个元素都有对应的顺序索引(支持索引)
//        (List 容器中每个元素都对应一个整数型序列号记载其在容器中的位置，可以根据序列号存取容器中的元素)
        System.out.println(list.get(2));

//        实现 List 接口的类有很多，但常用的为 ： ArrayList Vector LinkedList
    }
}
