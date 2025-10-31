package com.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//文件上传的客户端
public class TCPFileUploadClient {
    public static void main(String[] args) throws IOException {
        // 连接服务端 8888，得到 Socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        //创建读取磁盘文件的输入流
        String filePath = "d:\\2.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        // bytes 就是整个文件
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        // 通过 socket 获取输出流，将 bytes 数据发送到服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes); // 写入信息，
        //字节流不需要刷新
        socket.shutdownOutput();
        bis.close();

        //接受服务端的回应
        BufferedInputStream bis2 = new BufferedInputStream(socket.getInputStream());
        byte[] bytes2 = StreamUtils.streamToByteArray(bis2);
        String info = new String(bytes2);
        System.out.println(info);
        bis2.close();

        bos.close();
        socket.close();
    }
}
