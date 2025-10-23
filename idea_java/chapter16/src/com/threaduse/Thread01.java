package com.threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
//         创建 Cat 对象，当作线程使用
        Cat cat = new Cat();
        cat.start(); // 启动线程 ， 调用start方法时，会自动调用 run 方法
        /*
            调用 start() 方法
            public synchronized void start() {
                start0(); // 核心
            }

            start0() :
                private native void start0();
                一个本地方法，由JVM调用，底层为 C/C++
            因此，本质是 start0 方法实现了多线程的效果
         */
//        cat.run(); // 就是一个普通的方法，不会开辟出一个线程，会等到run 方法执行完毕后，才会继续往下执行
//        当 main 线程使用 start 启动一个子线程时,main 线程并不会等待子线程执行完毕才执行,
//        会继续执行, 当主线程一旦结束，如果还有子线程还在执行，则整个程序并不会停止，而是直到子线程结束
//        子线程中还可以继续开一个子线程
//        当线程全部执行完毕后，进程才会结束
//        子线程与主线程会交互执行(并发)
        System.out.println("主线程继续执行~" + Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("hello" + i);
            Thread.sleep(1000);
        }
    }
}
//继承 Thread 类来实现线程
// 当一个类继承了 Thread 类 ，该类就可以当作线程类来使用
// 会重写 run 方法，写上自己的业务逻辑， run 方法是 Thread 实现了 Runnable 接口的 run 方法
class Cat extends Thread {
    int i = 0;
    @Override
    public void run() {

        while (true) {
            System.out.println("喵喵喵，我是小猫咪" + (++i) + " 线程名：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // 单位毫秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i == 70) {
                break;
            }
        }

    }

}
