package com.printstream_;

import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws Exception {

        PrintStream out = System.out;
//        默认情况下, PrintStream 的输出位置是 标准输出,即显示器
        out.println("hi,Jack");
        /*
            public void print(String s) {
                write(String.valueOf(s));
            }
            print 底层就调用 write ,因此我们可以直接调用 write 来打印/ 输出
         */
        out.write("韩顺平~~".getBytes());
        out.close();

//        可以修改打印流输出的位置/设备
        System.setOut(new PrintStream("d:\\f1.txt"));
        System.out.println("hello,韩顺平教育");
    }
}
