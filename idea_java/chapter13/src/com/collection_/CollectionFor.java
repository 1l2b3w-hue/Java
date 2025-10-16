package com.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("三国演义","罗贯中",10.1));
        list.add(new Book("红楼梦","曹雪芹",34.6));
        list.add(new Book("小李飞刀","古龙",5.1));

        for(Object obj : list) {
            System.out.println(obj);
        }

    }
}
