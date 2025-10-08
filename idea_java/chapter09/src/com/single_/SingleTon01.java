package com.single_;

public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend girlFriend1 = new GirlFriend("小红");
//        GirlFriend girlFriend2 = new GirlFriend("小白");

//        GirlFriend girlFriend1 = GirlFriend.getGirlFriend();
//        System.out.println(girlFriend1);
//        GirlFriend girlFriend2 = GirlFriend.getGirlFriend();
//        System.out.println(girlFriend2);
////      看起来，好像创建了两个不同对象，但两个对象的指向还是一个对象
//        System.out.println(girlFriend1 == girlFriend2);
//        类一加载，就通过构造器创建了对象
        System.out.println(GirlFriend.n1);

    }
}
class GirlFriend {
    private String name;
    public static int n1 = 100;
//    2.类中创建对象
    private static GirlFriend gf = new GirlFriend("小红");

//    1.私有化构造器！
    private GirlFriend(String name) {
        System.out.println("构造器被调用了");
        this.name = name;
    }
//    3.提供一个静态的公共方法
    public static GirlFriend getGirlFriend() {
        return gf; // 为什么，因为如果不设置静态，你调用这个方法还是要创建一个对象
//        与原先要求，整个软件运行期间只允许一个实例对象相违背
    }
}
