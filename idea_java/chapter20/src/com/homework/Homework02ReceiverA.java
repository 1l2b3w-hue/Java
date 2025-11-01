package com.homework;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Homework02ReceiverA {
    public static void main(String[] args) throws Exception {
//        在端口号 8888 等待接收数据
        DatagramSocket socket = new DatagramSocket(8888);

//        接受数据包
        System.out.println("A 等待接受数据");
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet); // 数据存包

//        解包
        int len = packet.getLength();
        byte[] date = packet.getData();
        String s = new String(date,0,len);
        System.out.println("接受到消息：" + s);

//        准备回应
        String msg ;
        if("四大名著是哪些".equals(s)) {
            msg = "四大名著是<<红楼梦>>...";
        }
        else {
            msg = "what?";
        }

        byte[] sendData = msg.getBytes("utf-8");
        packet = new DatagramPacket(sendData,sendData.length,
                InetAddress.getByName("10.100.1.112"),8889);
        socket.send(packet);
        System.out.println("A 以及返送消息回应");


        socket.close();
    }
}
