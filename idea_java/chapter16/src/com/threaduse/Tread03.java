package com.threaduse;

//简单模拟一下静态代理模式
public class Tread03 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}
class Animal {}
class Tiger extends Animal implements Runnable {
    public void run() {
        System.out.println("老虎嗷呜叫~");
    }
}
class ThreadProxy implements Runnable{
    private Runnable target;

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void run() {
        if(target != null){
            target.run();
        }
    }
    public void start() {
        start0();
    }
    public void start0() {
        run();
    }

}
