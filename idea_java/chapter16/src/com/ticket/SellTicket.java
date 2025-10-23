package com.ticket;

//多线程模拟三个窗口同时售票
public class SellTicket {
    public static void main(String[] args) {
//        Windows windows1 = new Windows();
//        Windows windows2 = new Windows();
//        Windows windows3 = new Windows();
//        windows1.start();
//        windows2.start();
//        windows3.start();
        // 存在问题 ： 两个线程少数时间同时卖出一张票，但是票数不变,买一张还反增几张 (先售卖，后睡眠)
//                  如果先睡眠后售卖，存在超卖情况，票数为负

        Windows2 windows2 = new Windows2();
        Thread thread1 = new Thread(windows2);
        Thread thread2 = new Thread(windows2);
        Thread thread3 = new Thread(windows2);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Windows extends Thread{
    public static int tickets = 100;
    public void run() {
        while(true) {
            if(tickets <= 0) {
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("卖出一张票，剩余" + --tickets + "票");

        }
    }
}
class Windows2 implements Runnable{
    public static int tickets = 100;
    public void run() {
        while(true) {
            if(tickets <= 0) {
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("卖出一张票，剩余" + --tickets + "票");

        }
    }
}
