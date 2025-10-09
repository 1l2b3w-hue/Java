package com.interface_.package2_;

import com.interface_.package1_.Interface01;

public class Test implements Interface01 {
    public static void main(String[] args) {
        Test test = new Test();
//        不同包中访问a，进一步证明是public
        System.out.println(test.a);

    }
}
