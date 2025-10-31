package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// 接收端
public class UDPReceiverA {
    public static void main(String[] args) throws Exception {
//        创建 DatagramSocket 对象，准备在 端口号9999 接受数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
//        准备创建 DatagramPacket 对象接受数据报
        byte[] buffer = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
//        调用接受方法接受发送端发送过来的 datagramPacket,并将其填充到 datagramPacket对象中
        // 当有数据包被发送到 本机的 9999 端口，则会接受到数据
        // 如果没有数据包被发送到 本机的 9999 端口，将会发生阻塞等待接受
        System.out.println("A 等待接受数据");
        datagramSocket.receive(datagramPacket);

//        进行拆包,取出数据并显示
        int length = datagramPacket.getLength(); // 获取数据的完整长度
        byte[] data = datagramPacket.getData(); // 这里就获取了包中的数据
        String datas = new String(data,0,length);
        System.out.println(datas);

//        准备向 B 发送数据
        String message = "好的，明天见";
        byte[] sendData = message.getBytes();
        datagramPacket = new DatagramPacket(sendData,sendData.length,
                InetAddress.getByName("10.100.1.112"),9998);
        datagramSocket.send(datagramPacket);

//        关闭资源
        datagramSocket.close();

        System.out.println("A端退出");

    }
}
