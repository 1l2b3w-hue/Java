package com.method_;

// 守护线程
public class ThreadDaemonMethod {
    public static void main(String[] args) throws InterruptedException {
        Daemon daemon = new Daemon();
        daemon.setDaemon(true); // 设置为守护线程，注意设置为守护线程时，要求在启动线程之前
        daemon.start();

        for(int i = 0; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("main~~~" + i);
        }
    }

}
class Daemon extends Thread {
    int count = 0;
    public void run() {
        for(;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Daemon~~~" + (++count));
        }
    }
}
