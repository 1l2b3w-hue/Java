package com.map_;

import java.util.HashMap;
import java.util.Objects;

public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
//        树化
//        for(int i = 1; i <= 10; i++) {
//            hashMap.put(new A(i),i);
//        }

//       测试临界值
        for (int i = 1; i < 49; i++) {
            hashMap.put(i,"hello");
        }

        hashMap.put("java",20);
    }
}
class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return n == a.n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
