package com.transformation_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\hello3.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), "gbk");
        osw.write("hi,韩顺平教育"); // 以 gbk 编码存放
        osw.close();

        System.out.println("写入完成");
    }
}
