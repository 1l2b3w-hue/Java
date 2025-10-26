package com.inputstream_;

import com.outputstream_.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) {
        String filePath = "d:\\data.dat";
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readChar());
            System.out.println(ois.readUTF());

//            当我们需要使用到 Dog 类的方法时，就需要将 Dog 类放入可以引用的位置
            Object dog = ois.readObject(); // 抛出一个异常，处理就行
            System.out.println("运行类型：" + dog.getClass());
//            并不会输出 狗 使用 static 和 transient 修饰的成员
            System.out.println("狗的信息：" + dog);
            Dog dog2 = (Dog)dog;
            System.out.println(dog2.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
