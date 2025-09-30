package com.poly_;

public class poly01 {
    public static void main(String[] args) {
        Master master = new Master("Jack");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");

        master.feed(dog,bone);

        Cat cat = new Cat("小咪");
        Fish fish = new Fish("草鱼");
        master.feed(cat,fish);

        pig pig = new pig("佩奇");
        rice rice = new rice("米饭");
        master.feed(pig,rice);
    }
}
