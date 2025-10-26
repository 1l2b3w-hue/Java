package com.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
//    读取mysql.properties 文件的id,user,pwd

        BufferedReader br = new BufferedReader(new FileReader("src\\mysql.properties"));
        String readLine = null;
        char[] data;
        while ((readLine = br.readLine()) != null) {

//            System.out.println(readLine);
            String[] str = readLine.split("=");

            System.out.println(str[0] + "的值为：" + str[1]);

        }

        br.close();
    }
}
