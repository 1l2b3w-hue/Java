package com.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("j");
        arrayList.add("smith");
        arrayList.add("ki");
        arrayList.add("mar");

//        max(Collection) : 返回根据自然顺序进行排序后，集合中最大的元素
        System.out.println(Collections.max(arrayList));

//        max(Collection,Comparator) : 返回根据指定排序方式进行排序后，集合中最大的元素
        System.out.println(Collections.max(arrayList, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((String)o2).length() - ((String)o1).length();
            }
        }));

//        min(Collection) : 返回根据自然顺序进行排序后，集合中最小的元素
        System.out.println(Collections.min(arrayList));

//        min(Collection,Comparator) : 返回根据指定排序方式进行排序后，集合中最小的元素
        System.out.println(Collections.min(arrayList, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((String)o2).length() - ((String)o1).length();
            }
        }));

//        frequency(Collection,Object) : 返回指定集合中，指定元素出现的次数
        arrayList.add("smith");
        arrayList.add("smith");
        System.out.println(Collections.frequency(arrayList, "smith"));

//        copy(List dest,List src) : 将 src 中的内容复制到 dest 中 ,要求 dest 中size 必须 >= src的size
        ArrayList arrayList1 = new ArrayList();
        for(int i = 0 ; i < arrayList.size(); i++){
            arrayList1.add(null);
        }
        System.out.println(arrayList1);
        Collections.copy(arrayList1,arrayList);
        System.out.println(arrayList1);

//      boolean replaceAll(List list,Object oldVal,Object newVal)
        Collections.replaceAll(arrayList,"smith","韩顺平");
        System.out.println(arrayList);
    }
}
