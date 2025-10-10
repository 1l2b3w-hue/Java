package com.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
//        当做实参直接传递，简洁高效  单次修改不会引发其他调用变更
        f1(new IL(){
          public void show() {
              System.out.println("匿名内部类当作实参进行传递！");
          }
        });
//        传统方法调用f1 ： 类实现 => IL : 硬编码(除非要用多次) 单次修改引发整体变更
        f1(new AA());
    }
    public static void f1(IL il) {
        il.show();
    }
}
interface IL {
    void show();
}

class AA implements IL {
    public void show() {
        System.out.println("传统形式");
    }
}
