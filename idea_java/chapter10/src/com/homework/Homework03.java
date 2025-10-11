package com.homework;

public class Homework03 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Computer() {
            public Double work(double a, double b) {
                return a + b;
            }
        },10,20);
        cellphone.testWork(new Computer() {
            public Double work(double a, double b) {
                return a * b;
            }
        },10,29);
    }
}
interface Computer {
    public Double work(double a, double b);
}
class Cellphone {
    public void testWork(Computer c,double a, double b) {
        System.out.println(c.work(a,b));
    }
}



















//
//public class Homework03 {
//    public static void main(String[] args) {
//        Cellphone cellphone = new Cellphone();
//        cellphone.testWork(new Calculate() {
//            public Double work(double a, double b) {
//                return a + b;
//            }
//        },10,8);
//    }
//}
//interface Calculate {
//    public Double work(double a , double b);
//}
//class Cellphone {
//    public void testWork(Calculate cal,double a,double b) {
//       cal.work(a,b);
//    }
//
//}
