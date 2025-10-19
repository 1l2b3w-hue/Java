package com.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_ {
    public static void main(String[] args) {
//        Collections collections = new Collections();
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("smith");
        arrayList.add("king");
        arrayList.add("mary");

        System.out.println(arrayList);

//        reverse() :反转集合中元素的顺序
        Collections.reverse(arrayList);

//        shuffle() : 对集合元素进行随机排序
        Collections.shuffle(arrayList);

//        sort() : 根据元素自然顺序对集合元素进行排序
        Collections.sort(arrayList);

//        sort(List,Comparator) : 根据指定的 Comparator 对 List 进行排序
        Collections.sort(arrayList,new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });

//        swap(List,int,int) : 将 List 集合中的索引 i ，j 上位置的元素进行交换，不能超过范围
        Collections.swap(arrayList,0,1);
        System.out.println(arrayList);
    }
}
