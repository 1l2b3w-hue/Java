package com;

public class CPUNumber {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
//        获取当前电脑的 CPU 数量
        int i = rt.availableProcessors();
        System.out.println(i);
    }
}
