package com.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car1 = new Car("宝马",400000);
        Car car2 = new Car("宾利",5000000);

//        增加
        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println(arrayList);
//        删除
        arrayList.remove(car2);
        System.out.println(arrayList);
//        查找
        System.out.println(arrayList.contains(car1));
        System.out.println(arrayList);
//        个数
        System.out.println(arrayList.size());
        System.out.println(arrayList);
//        清空
        arrayList.clear();
        System.out.println(arrayList);

//       增加多个元素
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(car1);
        arrayList1.add(car2);
        arrayList1.add(new Car("小车",50000));
        arrayList1.add(new Car("二手车",80000));
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);

//        查找多个元素
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(car1);
        arrayList2.add(car2);
        System.out.println(arrayList.containsAll(arrayList2));

//        删除多个元素
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);

//        增强for遍历
        for(Object o : arrayList){
            System.out.println(o);
        }

//        迭代器遍历
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
class Car {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", price=" + price ;
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
