package com.exercise_;
//有2个用户分别从同一个卡上取钱（总额：10000）
//        （2）每次都取1000，当余额不足时，就不能取款了
//（3）不能出现超取现象=》线程同步问题
public class Exercise02 {
    public static void main(String[] args) {
//        user user1 = new user();
//        user user2 = new user();
//        user1.start();
//        user2.start();
        T t1 = new T();
        T t2 = new T();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
class T implements Runnable {
    private static int money = 10000;
    public void run() {
        while(true) {
            if(money < 1000) {
                System.out.println("余额不足~");
                break;
            }
            withdraw();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static synchronized void withdraw() {

        money -= 1000;
        System.out.println(Thread.currentThread().getName() + "取出1000元，还剩：" + money);
    }
}
//class user extends Thread{
//    private static int moneys = 10000;
//
//    public  void run() {
//        while(true) {
//            if(withdraw() == -1) {
//                System.out.println("没钱了");
//                break;
//            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//    public static synchronized int withdraw() {
//            if(moneys < 1000) {
//                return -1;
//            }
//            moneys -= 1000;
//            System.out.println(Thread.currentThread().getName() + "取出1000元，还剩：" +
//                    moneys );
//            return 1;
//    }
//}