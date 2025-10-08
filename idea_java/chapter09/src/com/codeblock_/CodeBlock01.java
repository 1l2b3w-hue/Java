package com.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("123");
        Movie movie2 = new Movie("123",88.8);
        Movie movie3 = new Movie("123",88.8,"456");
    }
}
class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开...");
        System.out.println("开始播放广告...");
        System.out.println("电影正式开始...");
    };
    //每个构造器中都是相同的三个语句，虽然可以，但是很冗余！
    public Movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("开始播放广告...");
//        System.out.println("电影正式开始...");
        System.out.println("构造器Movie(String name, double price, String director)被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("开始播放广告...");
//        System.out.println("电影正式开始...");
        System.out.println("构造器Movie(String name, double price)被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("开始播放广告...");
//        System.out.println("电影正式开始...");
        System.out.println("构造器Movie(String name)被调用");
        this.name = name;
    }
}
