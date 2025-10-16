package com.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
@SuppressWarnings({"all"})
public class ListExercise02 {

    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new LinkedList();
        List list = new Vector();
        list.add(new Book("红楼梦",100,"曹雪芹"));
        list.add(new Book("西游记",10,"吴承恩"));
        list.add(new Book("水浒传",9,"施耐庵"));
        list.add(new Book("三国志",80,"罗贯中"));
        System.out.println("==== 排序前 ====");
        for(Object obj : list){
            System.out.println(obj);
        }
        sort(list);
        System.out.println("==== 排序后 ====");
        for(Object obj : list){
            System.out.println(obj);
        }

    }
    public static void sort(List list) {
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = 0; j < list.size() - 1 - i; j++) {
                if(((Book)list.get(j)).getPrice() >((Book)list.get(j + 1)).getPrice()) {
                    Object temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("名称：%-4s  价格：%3.1f  作者：%3s", name, price, author);
//        return "名称：" + name + "\t\t价格：" + price + "\t\t作者：" + author ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
