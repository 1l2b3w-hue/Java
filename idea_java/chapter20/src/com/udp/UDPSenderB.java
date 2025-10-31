package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// 发送端 B :
public class UDPSenderB {
    public static void main(String[] args) throws Exception {
//        创建 DatagramSocket 对象,准备在 9998 端口接收数据 ? 因为发送端和接收端可能随时改变
//        后面指定发向的主机和端口号就行
        DatagramSocket datagramSocket = new DatagramSocket(9998);

//        创建 DatagramPacket 对象,存放待发送数据以及指定接受主机的IP和接受端口号
        String message = "hello  明天一起吃火锅~";
        byte[] sendData = message.getBytes();
//        DatagramPacket datagramPacket = new DatagramPacket(sendData,sendData.length,
//                InetAddress.getLocalHost(),9999);
//        建议发IP
//        封装内容 ： 字节数组(数据),长度,主机(知道IP),主机端口号
        DatagramPacket datagramPacket = new DatagramPacket(sendData,sendData.length,
                InetAddress.getByName("10.100.1.112"),9999);

//        发送数据
        datagramSocket.send(datagramPacket);

        System.out.println("B 等待接受数据");
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        datagramSocket.receive(packet);

//        拆包
        byte[] data = packet.getData();
        int length = packet.getLength();
        String s = new String(data,0,length);
        System.out.println(s);


        datagramSocket.close();
        System.out.println("B端退出");
    }

}
