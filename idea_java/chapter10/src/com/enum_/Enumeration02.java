package com.enum_;

/**
 * enum关键字实现枚举
 */
public class Enumeration02 {
    public static void main(String[] args) {
        Season2.SPRING.m1();
        Season2.SUMMER.m1();


    }
}
enum Season2 implements Father {
//    enum 实现枚举类
//    1. enum 代替 class
//    2.使用 : 常量名(形参列表) 来代替 public static final 类名 常量名 = new 类名(形参列表)
//          形参列表传递给构造器
//    3.多个常量(就是一个常量对象)时使用 , 分隔
//    4.使用enum实现枚举，要求将常量对象写在最前面
    SPRING("春天","多雨"){
        @Override
        public void m1() {
            System.out.println("我是春天");
        }
},
    SUMMER("夏天","炎热"){
        @Override
        public void m1() {
            System.out.println("我是夏天");
        }
    },
    AUTUMN("秋天","凉爽"){
        @Override
        public void m1() {
            System.out.println("我是秋天");
        }
    },

    WINTER("冬天","严寒"){
        @Override
        public void m1() {
            System.out.println("我是冬天");
        }
    };
    private String name;
    private String desc;
//    public static final Season2 spring = new Season2("春天","多雨");
//    public static final Season2 summer = new Season2("夏天","炎热");
//    public static final Season2 autumn = new Season2("秋天","凉爽");
//    public static final Season2 winter = new Season2("冬天","严寒");
    private Season2(String name, String desc) { // 私有化构造器
        this.name = name;
        this.desc = desc;
    }

    private String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

}
