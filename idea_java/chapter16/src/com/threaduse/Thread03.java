package com.threaduse;
//多线程案例
public class Thread03 {
    public static void main(String[] args) {
//        World world = new World();
//        world.start();
//        Hi hi = new Hi();
//        hi.start();
        Thread thread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 10) {
                    try {
                        System.out.println("hello world" + Thread.currentThread().getName());
                        Thread.sleep(1000);
                        i++;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (i < 5) {
                    try {
                        System.out.println("hi" + Thread.currentThread().getName());
                        Thread.sleep(1000);
                        i++;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread2.start();
    }
}

class World extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                System.out.println("hello world" + Thread.currentThread().getName());
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Hi extends Thread {

    public void run() {
        int i = 0;
        while (i < 5) {
            try {
                System.out.println("hi" + Thread.currentThread().getName());
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}