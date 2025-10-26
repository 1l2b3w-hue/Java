package com.standard_;

public class InputAndOutput {
    public static void main(String[] args) {
//        public static final InputStream in = null;
//        System.in : 编译类型就是 InputStream
        System.out.println(System.in.getClass()); // 运行类型 ：BufferedInputStream
//        public static final PrintStream out = null;
//        System.out : 编译类型就是 PrintStream
        System.out.println(System.out.getClass()); //运行类型是 ： PrintStream
    }
}
