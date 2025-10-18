package com.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","韩顺平");
        map.put("no2","张无忌");

//        k - v 最后就是存放在 HashMap$Node (node = newNode(hash,key,value,null))
//        k - v 为了程序员的遍历方便，还会创建一个 EntrySet 集合，
//        该集合类型存放的元素类型为 Entry (即实现了Entry 接口类的实例对象)，
//        EntrySet<Entry<k,v>> 即： transient Set<Map.Entry<K,V>> entrySet;
//        entrySet 中，定义的类型就是 Map.Entry,但实际上存放的还是 HashMap$Node
//        因为 HashMap$Node 实现了 Map.Entry
//        当把 HashMap$Node 存放进 EntrySet 时是方便了遍历(Entry 提供了两个方法一次就可以拿到 k 和 v)
//        Entry 中提供了K getKey(); V getValue();两个方法
//        为什么要 EntrySet 这个集合 ： 将底层分散的Node（或其他Entry实现）包装成一个符合集合规范的视图(引用方式)
//        让Map的遍历既能统一、安全，又能屏蔽底层实现细节，这正是 Java 面向接口编程思想的典型体现

//        HashMap中创建的Node节点本身就是Entry接口的实现，因此天然可被视为Entry对象；EntrySet作为视图，
//        通过遍历底层Node并以Entry类型引用它们，实现了对键值对的统一访问，而非主动 “转换” 或 “存放”Entry。

//        keySet()和values()和entrySet()一样，都是视图机制，目的是 “以不同形式访问已有数据，不额外拷贝存储”，
//        keySet() 访问所有的 key; values() 访问所有的value entrySet()则访问所有的 key - value

        Set set = map.entrySet();
        System.out.println(set.getClass()); //HashMap$EntrySet
        for (Object o : set) {
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        Set set1 = map.keySet(); // 访问所有的 key
        System.out.println(set1.getClass()); // HashMap$KeySet
        Collection values = map.values(); // 访问所有的 value
        System.out.println(values.getClass());// HashMap$Values
    }
}
