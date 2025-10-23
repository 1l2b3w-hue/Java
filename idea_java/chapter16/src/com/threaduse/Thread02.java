package com.threaduse;

public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.start(); 无法调用，Runnable 中没有这个方法
//        创建 Thread 对象， 将 dog 对象(实现了 Runnable 接口的对象)传入 Thread 构造器中
//        底层采用了一个设计模式 ： 代理模式 (静态代理 和 动态代理)，这里为静态代理
        Thread thread = new Thread(dog);
        thread.start();

    }
}
class Dog implements Runnable  {
    public void run() {
        int i = 0;
        while(true) {
            System.out.println("小狗汪汪叫hi" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(++i == 10) {
                break;
            }
        }
    }
}
