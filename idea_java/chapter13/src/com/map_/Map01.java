package com.map_;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
//        Map 实现类的特点
//          用于保存具有映射关系的数据 ：key - value (双列元素)(Set 其实也是这样的，value 指常量对象 PRESENT)
//          key 和 value 可以是任意引用类型的对象，会被封装到 HashMap$Node 中(即 Node 对象的 key属性 和 value属性)
//          key 不能被重复，原因与 HashSet 一样，但采用替换机制
//          value 可以重复
//          key 和 value 都可以为 null，但是 key 只能有一个 null， value 可以多个
//          常用 String 作 key
//          key 与 value 存在单向一对一的关系，通过 key 可以找到对应的 value
        Map map = new HashMap();
        map.put("no1","韩顺平");
        map.put("no2","张无忌");
        map.put("no1","张三丰"); // 新的 value 替换 旧的 value
        map.put("no3","张三丰"); // 因为前面的 k 不同，双方在 table 的索引位置也是不同的，
        // 既然不同，value 当然可以重复
        map.put(null,null);
        map.put(null,"abc"); // abc 替换 null
        map.put("no4",null);
        map.put("no5",null);

        System.out.println(map.get("no1"));
        System.out.println(map.get("no3"));
        System.out.println(map.get("no5"));

        System.out.println(map);
    }
}
