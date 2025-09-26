package com.use;

import com.xiaoming.Dog;
//import com.xiaoqiang.Dog;
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();//这里已经默认是xiaoming下的类了
        System.out.println(dog); //com.xiaoming.Dog@1ee0005
//        引入小强的dog类 ,为了区分要带上完整的包名和类名
        com.xiaoqiang.Dog dog1 = new com.xiaoqiang.Dog();
        System.out.println(dog1); //com.xiaoqiang.Dog@3d012ddd

        System.out.println(Math.abs(-1)); //直接用，不用引入lang
    }
}
