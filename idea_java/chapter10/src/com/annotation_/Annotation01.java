package com.annotation_;

/**
 * @Override 注解的使用
 */
public class Annotation01 {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){
        System.out.println("Father fly...");
    }

}
class Son extends Father{
//      @Override 在fly方法上，表示该方法是对父类方法的重写
//    如果不写@Override，结果还是父类方法的重写
//    写了@Override,编译器会主动检查是否重写了父类的方法，是就编译通过，不是就编译错误，起到语法校验
//      @Override的定义
//      @Target(ElementType.METHOD)
//      @Retention(RetentionPolicy.SOURCE)
//      public @interface Override {
//}
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }
}
