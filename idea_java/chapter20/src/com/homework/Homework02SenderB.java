package com.homework;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Homework02SenderB {
    public static void main(String[] args) throws Exception {
//        在 8889 端口号准备监听
        DatagramSocket socket = new DatagramSocket(8889);

//        准备发送消息
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要问的问题：");
        String s = sc.next();
        byte[] sendData = s.getBytes();
        DatagramPacket packet = new DatagramPacket(sendData, sendData.length,
                InetAddress.getByName("10.100.1.112"), 8888);
        socket.send(packet);
        System.out.println("B 以及发送消息");

        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);

        int length = packet.getLength();
        byte[] receiveData = packet.getData();
        s = new String(receiveData,0,length,"utf-8");
        System.out.println(s);

        socket.close();

    }
}
