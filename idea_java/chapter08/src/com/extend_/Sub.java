package com.extend_;

public class Sub extends Base{

    public Sub(String name,int age) {
        // 1. 调用父类的无参构造器 : super() 或啥也不写
//        super();
        //2.  调用父类的Base(String name)
//        super("jack");
        // 3. 调用父类的Base(String name,int age)
        super("jack",10);
        System.out.println("Sub(String name,int age) ~");
    }


    public Sub() {
//      super(); 存在一个super方法，会默认调用父类的无参构造器
//       必须指定要调用的构造器
        super("jack",20);
        System.out.println("无参Sub~");
    }
//    无论通过子类的哪个构造器创建对象时，都会默认调用父类的无参构造器来实现对父类的初始化
    public Sub(String name) {
        super("Tom",5);
        System.out.println("有参Sub构造器");
    }

//    测试父类属性和方法在不同修饰符下的访问情况
    public void sayOk() {
//        非私有类型的属性和方法可以在子类中直接访问
        System.out.println(n1 + "" + n2 + "" + n3);
        test100();
        test200();
        test300();
//        私有类型的属性和方法无法直接在子类中被访问
//        System.out.println(n1 + "" + n2 + "" + n3 + "" + n4);
//        test400();
        System.out.println("n4 = " + getN4());
        callTest400();
    }
}
