package com.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("三国演义","罗贯中",10.1));
        list.add(new Book("红楼梦","曹雪芹",34.6));
        list.add(new Book("小李飞刀","古龙",5.1));

//        获取构造器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) { //判断是否还有元素
//            System.out.println(iterator.next());
            Object obj = iterator.next(); //返回下一个元素，类型为Object(编译)
            System.out.println("obj = " + obj);
        }
//       快速生成构造器遍历 ： itit (Ctrl + j 查看快捷键生成)

//        当执行完while循环时,next()已经指向了最后的一个元素,再次执行将会抛出错误
//        iterator.next(); // NoSuchElementException
//        因此,想要在遍历一次集合时,想要重置一遍迭代器
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next = " + next);
        }

    }
}
class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
