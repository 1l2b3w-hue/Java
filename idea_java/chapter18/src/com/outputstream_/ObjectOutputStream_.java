package com.outputstream_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) {
        Dog dog = new Dog("小花", 11,"花色","中国");
        String filePath = "d:\\data.dat";
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
//            基本类型都会进行一个装箱操作形成包装类，包装类是实现了 serializable
            oos.writeInt(100);
            oos.writeBoolean(true);
            oos.writeChar('A');
            oos.writeUTF("hello");
            oos.writeObject(dog);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("数据保存完毕");
    }
}

