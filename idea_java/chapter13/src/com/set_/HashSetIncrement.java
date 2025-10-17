package com.set_;

import java.util.HashSet;
import java.util.Objects;

public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        验证 HashSet 扩容机制
//        for(int i = 0; i < 100; i++) {
//            hashSet.add(i);
//        }

//        验证树化
//        for (int i = 0; i < 13; i++) {
//            hashSet.add(new A(i));
//        }

//        验证 size 与增加节点位置的关系 ： 无论加在哪里，size都将会 ++
        for(int i = 1; i <= 7 ; i++) {
            hashSet.add(new A(i));
        }
        for(int i = 1; i <= 7; i++) {
            hashSet.add(new B(i));
        }
    }
}
class B {
    private int i;

    public B(int i) {
        this.i = i;
    }
    @Override
    public int hashCode() {
        return 200; // 保证经过 hash 计算后是同一个hash 值
    }
}
class A {
    private int n;

    @Override
    public int hashCode() {
        return 100; // 保证经过 hash 计算后是同一个hash 值
    }

    public A(int n) {
        this.n = n;
    }
}