package com.method_;

public class ThreadMethodExercise {
    public static void main(String[] args)throws Exception {
        T3 t3 = new T3();
        Thread t1 = new Thread(t3);
        for(int i = 1;i <= 10; i++) {
            if(i == 6) {
                t1.start();
                t1.join();
            }
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
    }
}
class T3 implements Runnable {
    public void run() {
        for(int i = 1; i <= 10;i++) {
            try {
                Thread.sleep(1000);
                System.out.println("hello" + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}