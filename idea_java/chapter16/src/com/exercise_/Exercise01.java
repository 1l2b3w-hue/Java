package com.exercise_;



import java.util.Scanner;
//在main方法中启动两个线程
//        第1个线程循环随机打印100以内的整数
//直到第2个线程从q键盘读取了“Q”命令。
public class Exercise01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2(t1);
        t1.start();
        t2.start();
    }
}
class T1 extends Thread {
    private boolean flag = true;
    public void run() {
        while(flag) {
            System.out.println((int)Math.floor(Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
class T2 extends Thread {
    private T1 t1;
    private Scanner scanner = new Scanner(System.in);
    public T2(T1 t1) {
        this.t1 = t1;
    }
    public void run() {
        while(true) {
            System.out.println("请输入一个字母Q结束循环：");
            char c = scanner.next().toUpperCase().charAt(0);
            if(c == 'Q') {
                t1.setFlag(false);
                break;
            }
        }
    }
}
//class T2 extends Thread {
//    public void run() {
//        while(true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("请输入一个字母Q结束循环：");
//            char c = scanner.next().charAt(0);
//            if(c == 'Q') {
//                T1.flag = false;
//                break;
//            }
//        }
//    }
//}

