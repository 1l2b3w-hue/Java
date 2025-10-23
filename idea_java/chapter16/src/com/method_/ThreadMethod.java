package com.method_;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("老伟");
        t.setPriority(Thread.MIN_PRIORITY);

        t.start();
        for(int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }
//        中断 t 线程的休眠
        t.interrupt();

    }
}
class T extends Thread {

    public void run() {
        while(true) {
            for(int i = 1; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 在吃包子" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + " 开始休息再吃包子");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
//            InterruptedException 捕获到了中断异常
                System.out.println(Thread.currentThread().getName() + " 吃饱了，不吃了");
            }
        }
    }
}
