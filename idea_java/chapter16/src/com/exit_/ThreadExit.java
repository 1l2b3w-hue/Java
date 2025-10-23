package com.exit_;

public class ThreadExit  {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
//        在 主线程中去中断 t 线程 (通知方式 ：使 t 线程退出 run 方法，从而终止 t 线程)
        System.out.println("main 线程开始休眠10秒");
        Thread.sleep(10  * 1000);
        t.setFlag(false);

    }
}
class T extends Thread {
    private int count = 0;
    private boolean flag = true;
    @Override
    public void run() {
        while (flag) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T运行中 " + (++count) );
        }
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
