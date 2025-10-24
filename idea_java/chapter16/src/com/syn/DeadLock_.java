package com.syn;

public class DeadLock_ {
    public static void main(String[] args) {
//        模拟死锁
        T t = new T(true);
        T t1 = new T(false);
        t.start();
        t1.start();
    }
}
class T extends Thread{
    static Object lock1 = new Object();
    static Object lock2 = new Object();
    boolean flag;
    public T(boolean flag) {
        this.flag = flag;
    }

    public void run() {
//        如果 flag 为 T,则线程 将会获取 lock1，执行输出语句后尝试着获取 lock2执行后面的输出语句，如果无法获取到
//      就会死锁
//         如果 flag 为 F,则线程 将会获取 lock2，执行输出语句后尝试着获取 lock1执行后面的输出语句，如果无法获取到
//      就会死锁
        if(flag) {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " 进入1~");
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + " 进入2~");
                }
            }
        }
        else {
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " 进入3~");
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + " 进入4~");
                }
            }
        }
    }
}
