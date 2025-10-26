package com.writer_;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:\\hello.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:\\helloCopy.txt",true));
        String line = null;
        while((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        bufferedReader.close();
    }
}
