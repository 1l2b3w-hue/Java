package com.method_;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();
        for(int i = 0; i < 20; i++) {
            if(i == 5) {
//                t2.join();
                Thread.yield();
            }
                Thread.sleep(1000);

            System.out.println("hi" + i);
        }
    }
}
class T2 extends Thread {
    public void run() {
        for(int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello" + i);
        }
    }
}