package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        outputStream.write("hello,server".getBytes());
        // 通知服务器端，我这里数据已经发送完毕了，你可以干自己的事情了
//        socket.shutdownOutput()(写入结束标记) ： 单纯关闭 输出流
        socket.shutdownOutput();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }


        outputStream.close(); // 会连带关闭整个 socket连接
        inputStream.close();
        socket.close();


    }
}
