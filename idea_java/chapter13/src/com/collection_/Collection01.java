package com.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collection01 {

public static void main(String[] args) {

    //    Collection
    //    Map
//    集合主要分为两类(单列、双列)
//    Collection 接口有两个重要的子接口 ：Set List, 其实现子类都是单列集合
//    Map 接口的实现子类都是双列集合，存放键值对

//    单例集合(举个例子)
    ArrayList arrayList = new ArrayList();
    arrayList.add("a"); // 加单个数据的就是单例集合

//    双列集合
    HashMap hashMap = new HashMap();
    hashMap.put("Num1", "b"); // 加两个数据的就是双列集合
}
}
