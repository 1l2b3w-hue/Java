package com.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Homework01Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner sc = new Scanner(System.in);
        System.out.print("请选择你要发送的信息 ：");
        String input = sc.next();
        bw.write(input + "\r\n");
        bw.newLine();
        bw.flush();
//        socket.shutdownOutput();



        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);


        bw.close();
        br.close();
        socket.close();
    }
}
