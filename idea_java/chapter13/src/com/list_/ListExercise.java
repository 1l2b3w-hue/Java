package com.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Jack");list.add("marry");list.add("smith");list.add("tom");list.add("jury");
        list.add("hello");list.add("hi");list.add("say");list.add("cry");list.add("yell");
        list.add(2,"韩顺平教育");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"HI");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.print(obj + "\t");
        }


    }
}
