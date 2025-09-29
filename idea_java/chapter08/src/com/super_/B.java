package com.super_;

public class B extends A{
    public int n1 = 888;
//    super 访问父类属性(但不能访问父类私有属性)
    public void hi() {
//        System.out.println(super.n1 + " " + super.n2 + " " + super.n3
//        + " " + super.n4); 无法访问私有属性n4
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3 + " " );
    }

//    super 访问父类方法(不能访问父类私有方法)
    public void hi2() {
        super.test100();
        super.test200();
        super.test300();
//        super.test400();
    }
    public void cal() {
        System.out.println("B类的cal()");
    }
    public void sum() {
        System.out.println("B类的sum()方法");
//        此时想要调用cal方法，于是乎，出现了下面的查找顺序 (方法就从方法区中逐步查找)
//        1.先查找本类中是否含有该方法，有就调用自身的cal方法
//        2.如果本类中没有，将会到父类中去查找，如果有，并且可以访问，则执行该方法，如果不能执行，会在编译时报错(没有权限访问)
//        3.如果没有，重复步骤2，3执直到查完Object还没有找到，将t提示方法不存在(无法解析)
//        下面三种逻辑在子类没有重名方法时，是等价的
        cal();
        this.cal(); // this的逻辑与直接写的逻辑完全一样
        super.cal();//与上面的查找存在不同 ： 直接查找父类，不会查本类

//        访问属性规则 (就直接从堆中直接往上(就是根据父子关系)查)
//        与查找方法是一样的规则
//        this 和 直接引用是等价的，super直接从父类查起
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }

}
