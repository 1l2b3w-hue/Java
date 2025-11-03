package com.qqserver.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *  向所有在线用户推送信息(创建一个线程，等待输入信息，一旦输入后就立马发送)
 */
public class SendNewsToAllService extends Thread {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while(true) {
            System.out.print("请输入服务器要推送的新闻/消息(输入 exit 表示退出推送服务): ");
            Message message = new Message();
            message.setSender("服务器");
            message.setMsgType(MessageType.MESSAGE_TO_ALL);
            String content = scanner.next();
            if("exit".equals(content)) {
                break;
            }
            message.setContent(content);
            message.setSendTime(new Date().toString());
            System.out.println("服务器推送消息给所有人:" + content);
            // 获取所有在线用户线程的 socket
            HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();
            Iterator<String> iterator = hm.keySet().iterator();
            while(iterator.hasNext()) {
                String key = iterator.next();
                try {
                    ObjectOutputStream oos =
                            new ObjectOutputStream(hm.get(key).getSocket().getOutputStream());
                    oos.writeObject(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
