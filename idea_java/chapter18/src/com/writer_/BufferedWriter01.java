package com.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\hello.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        String content = "hello, 韩顺平教育";
        bufferedWriter.write(content);

        bufferedWriter.close();
    }
}
