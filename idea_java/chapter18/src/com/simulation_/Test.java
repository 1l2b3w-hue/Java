package com.simulation_;

import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        FileReader_ fr = new FileReader_();
        fr.readFile();
        StringReader_ sr = new StringReader_();
        sr.readString();

        BufferedReader_ bufferedReader = new BufferedReader_(fr);
        bufferedReader.readFiles(5);

        BufferedReader_ bufferedReader2 = new BufferedReader_(sr);
        bufferedReader2.readString(5);
    }
}
