package com.set_;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
           /* 1. 实际上就是 HashMap
             public HashSet() {
                map = new HashMap<>();
            }
         */
        HashSet set = new HashSet();
//        2.可以存放 null 值，但只能存放一个(不能存放重复元素)
        set.add(null);
        set.add(null);
//        3. HashSet 不保证元素有序，取决于 hash 后，再确定索引结构，就是不保证添加的顺序与取出的顺序一致
        System.out.println(set);
//        猜对了，追源码就可以了解了
        System.out.println(set.add(new String("hsp")));// true
        System.out.println(set.add(new String("hsp")));// false
    }
}
