package com.homework;

public class Homework04 {
    public static void main(String[] args) {
//        new A().new B().show();


//        A.B b  = new A().getB();
//        b.show();
//        A.B b = new A.B();
//        b.show();

        new A().f1();
    }
}
interface IA {
    public void show();
}
class A {
    private  String NAME = "A";

    public void f1() {
        new IA() {
            public final String NAME = "韩顺平";
            public void show() {
                System.out.println(NAME);
                System.out.println(A.this.NAME);
            }
        }.show();

    }



//    public void f1() {
//        class B {
//            private final String NAME = "韩顺平";
//            public void show() {
//                System.out.println(NAME);
//                System.out.println(A.this.NAME);
//            }
//
//        }
//        new B().show();
//
//    }




//    class B {
//        private final String NAME = "张三";
//        public void show() {
//            System.out.println(NAME);
//            System.out.println(A.this.NAME);
//        }
//    }



//    public static class B {
//        private final String NAME = "张三";
//        public void show() {
//            System.out.println(NAME);
//            System.out.println(A.NAME);
//        }
//    }
//    public B getB() {
//        return new B();
//    }

}

