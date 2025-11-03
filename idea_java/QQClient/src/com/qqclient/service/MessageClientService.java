package com.qqclient.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

/**
 * 该类/对象 提供和信息相关的服务
 */

public class MessageClientService {

    public void sendMessageToAll(String senderId,String content) {
        Message message = new Message();
        message.setSender(senderId);
        message.setContent(content);
        message.setSendTime(new Date().toString()); // 这里时间格式需要进行更改
        message.setMsgType(MessageType.MESSAGE_TO_ALL);
        System.out.println(senderId + " 对大家说 " + content);

        //准备发送信息
        ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread.getClientConnectServerThread(senderId);
        Socket socket = clientConnectServerThread.getSocket();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void sendMessageToOne(String senderId, String content,String receiverId) {
        Message message = new Message();
        message.setSender(senderId);
        message.setContent(content);
        message.setReceiver(receiverId);
        message.setSendTime(new Date().toString()); // 这里时间格式需要进行更改
        message.setMsgType(MessageType.MESSAGE_COMM_MESSAGE);
        System.out.println(senderId + " 对 " + receiverId + " 说 " + content);

        //准备发送信息
        ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread.getClientConnectServerThread(senderId);
        Socket socket = clientConnectServerThread.getSocket();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
