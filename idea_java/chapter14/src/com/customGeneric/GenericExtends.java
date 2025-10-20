package com.customGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("Hello");
        // 泛型不具备继承性
//        List<Object> list = new ArrayList<String>();

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();
//        <?> : 接受任意类型的泛型
        f1(list1);
        f1(list2);
        f1(list3);
        f1(list4);
        f1(list5);
//        <? extends AAA> : 表示上限 接受 AAA 或AAA的子类
//        f2(list1);
//        f2(list2);
        f2(list3);
        f2(list4);
        f2(list5);

//        <? super CCC> : 表下限，接受 CCC 或 CCC的父类，不限于直接父类
        f3(list1);
//        f3(list2);
        f3(list3);
        f3(list4);
        f3(list5);
    }
    public static void f1(List<?> list) {
        System.out.println(list);
    }
    public static void f2(List< ? extends AAA> list) {
        System.out.println(list);
    }
    public static void f3(List<? super CCC> list) {
        System.out.println(list);
    }
}
class AAA {

}
class BBB extends AAA {

}
class CCC extends BBB {}