package com.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

// 字符流
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        bufferedWriter.write("hello server 字符流");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.flush(); // 需要进行刷新一下才能使数据写入数据通道
        // 加入一个换行，表示写入的数据内容结束 ，可以作为一个结束标志,但要注意对方必须使用 readLine 来读取数据，否则不知道结束

//        socket.shutdownOutput();


        String line;
        while((line = bufferedReader.readLine()) != null) {
            if(line.isEmpty()) {
                break;
            }
            System.out.println(line);
        }

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
