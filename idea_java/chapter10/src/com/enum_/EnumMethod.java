package com.enum_;

/**
 * Enum的常用方法
 */
public class EnumMethod {
    public static void main(String[] args) {
//        Enum
        Season2 autumn = Season2.AUTUMN;
//        显示枚举常量名字
        System.out.println(autumn.name());
//        输出该枚举对象的次序/编号(排的次序)，从零开始
        System.out.println(autumn.ordinal());
        // values() 方法 ：返回一个枚举类型的数组，包含所有的枚举对象
        Season2[] seasons = Season2.values();
        for(Season2 season : seasons) { // 依次从数组中取出一个值交给season，然后执行循环体，但取完就退出循环
            System.out.println(season);
        }
        //valuesOf() : 接受一个字符串，并将该字符串转换为枚举对象，要求字符串必须是已有常量名，否则报错
//        顺序 ：根据你传入的字符串进入对应枚举类中查找对应的枚举对象，找到就返回，没有就报错
        Season2 autumn2 = Season2.valueOf("AUTUMN");
        System.out.println(autumn2);

//        compareTo() : 比较两个枚举对象的编号,返回两者的差值
//       Season2.AUTUMN.compareTo(Season2.SUMMER)返回AUTUMN的编号 - SUMMER的编号
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
    }
}

