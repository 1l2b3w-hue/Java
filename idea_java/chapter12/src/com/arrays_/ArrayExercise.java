package com.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅新版",90);
        books[2] = new Book("青年文摘",5);
        books[3] = new Book("Java从入门到放弃",300);
//        Book.sort(books);
        Book.sort(books,new Comparator() {
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
//                不推荐强转！
//                return (int)(b2.getPrice() - b1.getPrice());
//                return (int)(b1.getPrice() - b2.getPrice());
//                return b1.getName().length() - b2.getName().length();
//                return b2.getName().length() - b1.getName().length();
                double priceVal = b2.getPrice() - b1.getPrice();
                if( priceVal > 0) {
                    return 1;
                } else if (priceVal < 0) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

        for(Book book : books) {
            System.out.println(book);
        }
    }
}
class Book {
    private String name;
    private double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void sort(Book[] books) {
        for(int i = 0; i < books.length; i++) {
            for(int j = i + 1; j < books.length; j++) {
                if(books[i].getPrice() < books[j].getPrice()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
    public static void sort(Book[] books, Comparator c) {
        for(int i = 0; i < books.length - 1; i++ ) {
            for(int j = 0; j < books.length - 1 -i; j++) {
                if(c.compare(books[j],books[j + 1]) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}