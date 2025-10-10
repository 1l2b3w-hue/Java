package com.innerclass;

/**
 * 匿名局部类
 */

public class AnonymousInnerclass {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.m1();

    }
}
class Outer03 {

    public void m1() {
//        当要使用一个接口，并创建对象，
//        传统就是 ：就使用一个类来实现该接口，并创建对象使用
//        但现在问题来了 ： 如果只会用一次Tiger类后面不再使用，
//        IA tiger  = new Tiger(); // 接口多态
//        tiger.cry();
//        通过匿名内部类来解决
//        编译类型 ： IA
//        运行类型 ： 匿名内部类 ： 外部类 + $1
        /*
            底层 ： 创建一个类 实现IA接口
            class XXXX(系统分配) implements IA {
                 public void cry() {
                    System.out.println("老虎叫");
                }
            }
         */
//        底层创建了一个类后，立马创建一个实例并返回给tiger
//        匿名内部类使用一次就消失了(返回一个实例后就没了，)
        IA tiger =new IA() {
            public void cry() {
                System.out.println("老虎叫");
            }
        };
        tiger.cry();
        System.out.println(tiger.getClass());

//        基于类来实现匿名内部类
//        father : 编译类型 ： Father 运行类型就是 ： Outer03$2
        /*
            底层实现 ：
            class Outer03$2 extends Father {
                public void m2() {
                  System.out.println("匿名内部类重写方法");
                }
            }
         */
        Father father = new Father("Jack"){ // Jack会主动的传递给Father的构造器
//            匿名内部类不能重写构造器
              public void m2() {
                  System.out.println("匿名内部类重写方法");
              }
        };
//        Father father = new Father("Jack");//注意区别，加了{}就是匿名内部类，没加就不是了
        father.m2();
        System.out.println(father.getClass());
    }
}
interface IA {
    void cry();
}
//class Tiger implements IA {
//    public void cry() {
//        System.out.println("老虎叫...");
//    }
//
//}
class Father {
    public Father(String name) {
    }
    public void m2() {

    }
}