package com.innerclass;


/**
 * 局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println(outer02);
    }

}
class Outer02 {
    private int n1 = 10;
    private void m2() {
        System.out.println("Outer02");
    };
//    1.局部内部类通常定义在外部类的方法上，可以访问外部类的所有成员，包括私有属性
//    2.局部变量不能添加访问修饰符，单可以添加final修饰，不让其他局部内部类继承
//    3.作用域仅在定义的方法和代码块中
    public void m1() {
        final class Inner02 { // 局部内部类
            private int n1 = 800;
//     7.当内部局部类的成员与外部类重名时，默认遵循就近原则
//            访问外部类可以采用外部类名.this.成员
            public void f1() {
//     4.局部内部类可以直接访问外部类成员
                System.out.println("n1 = " + n1 );
//                Outer02.this : 就是外部类的对象 ，谁调用了m1，谁就是Outer02.this
                System.out.println("n1 = " + Outer02.this.n1);
                System.out.println(Outer02.this);
                m2();
                Outer02.this.m2();
            }
            public void m2() {
                System.out.println("inner02");
            }
        }
//        5.外部类使用局部内部类 ： 在方法中创建局部内部类的实例，再通过实例调用
        Inner02 inner02 = new Inner02();
        inner02.f1();

//        class Inner03 extends Inner02 {
//
//        }
    }
}
//外部其他类无法访问到内部局部类
class A {
   public void f1() {
//       Inner02 inner02 = new Inner02();
   }
}