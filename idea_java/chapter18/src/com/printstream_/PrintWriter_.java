package com.printstream_;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter(System.out);
        PrintWriter pw = new PrintWriter(new FileWriter("d:\\f2.txt"));
        pw.print("hi,你好北京");
        pw.close();

    }
}
