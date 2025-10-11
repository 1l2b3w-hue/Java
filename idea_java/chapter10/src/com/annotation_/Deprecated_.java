package com.annotation_;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}
// 使用@Deprecated修饰某个元素时，表示该元素已经过时了，即不推荐使用，但是还是可以使用的
// 可以修饰方法 、 包、 字段、 参数 、 类 ....
//
//源码
//@Documented
//@Retention(RetentionPolicy.RUNTIME)
//@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
//public @interface Deprecated
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi() {

    }
}