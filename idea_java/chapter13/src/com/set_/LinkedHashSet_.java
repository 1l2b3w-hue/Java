package com.set_;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

@SuppressWarnings({"all"})
public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(123);
        set.add("HSP");
        System.out.println(set);
        /*
            1.LinkedHashSet 底层维护了 LinkedHashMap (HashMap 的子类)
            2.进行第一次添加时，将会使 table 扩容至 16
            3.table 的类型为 : HashMap@Node[],存放的节点类型为 : LinkedHashMap@Entry(Entry 继承了 Node)(多态)
                static class Entry<K,V> extends HashMap.Node<K,V> 一个类的静态内部类继承了父类的静态内部类
         */
    }
}
