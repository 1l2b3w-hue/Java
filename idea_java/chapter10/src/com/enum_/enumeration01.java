package com.enum_;

/**
 * 自定义枚举类型
 */
public class enumeration01 {
    public static void main(String[] args) {

//
        System.out.println(Season.spring);
        System.out.println(Season.summer);
        System.out.println(Season.winter);
        System.out.println(Season.autumn);

    }
}
class Season { // 设计一个类，描述四季
    private String name;
    private String desc;
    public static final Season spring = new Season("春天","多雨");
    public static final Season summer = new Season("夏天","炎热");
    public static final Season autumn = new Season("秋天","凉爽");
    public static final Season winter = new Season("冬天","严寒");
    private Season(String name, String desc) { // 私有化构造器
        this.name = name;
        this.desc = desc;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
