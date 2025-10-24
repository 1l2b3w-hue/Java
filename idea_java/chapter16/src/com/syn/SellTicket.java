package com.syn;

public class SellTicket {
    public static void main(String[] args) {
//        Windows windows1 = new Windows();
//        Windows windows2 = new Windows();
//        Windows windows3 = new Windows();
//        windows1.start();
//        windows2.start();
//        windows3.start();
//
//        Windows2 windows1 = new Windows2();
//        Windows2 windows2 = new Windows2();
//        Windows2 windows3 = new Windows2();
//        new Thread(windows1).start();
//        new Thread(windows2).start();
//        new Thread(windows3).start();

//        采用同步机制完成，解决超票卖出问题
        Windows3 windows1 = new Windows3();
        new Thread(windows1).start();
        new Thread(windows1).start();
        new Thread(windows1).start();


    }
}
//使用同步机制来实现
class Windows3 implements Runnable {
    private static int tickets = 100;
    private static boolean flag = true;
    Object obj = new Object();
    public void run() {
        while(flag) {
           sell();
        }
    }
//    public void sell() {
//        synchronized(/*this*/obj) { // 可以是当前对象，也可以是其他对象
//            if(tickets <= 0) {
//            System.out.println("票卖完了~");
//            flag = false;
//            return;
//        }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("卖出去一张票，还剩" + (--tickets) + "张票");
//        }
//    }
    public static void sell() { // 搞一个同步方法来完成
//        静态方法中，锁是加在 类本身的 ： 类名 + .class
       synchronized (Windows3.class) { // 不能为 this
           if(tickets <= 0) {
               System.out.println("票卖完了~");
               flag = false;
               return;
           }
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("卖出去一张票，还剩" + (--tickets) + "张票");


       }
    }
}
class Windows extends Thread {
    private static int tickets = 100;
    public void run() {
        while(true) {
            if(tickets <= 0) {
                System.out.println("票卖完了~");
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("卖出去一张票，还剩" + (--tickets) + "张票");

        }
    }
}
class Windows2 implements Runnable {
    private static int tickets = 100;
    public void run() {
        while(true) {
            if(tickets <= 0) {
                System.out.println("票卖完了~");
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("卖出去一张票，还剩" + (--tickets) + "张票");

        }
    }
}