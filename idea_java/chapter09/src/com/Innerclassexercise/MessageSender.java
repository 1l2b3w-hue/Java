package com.Innerclassexercise;

public class MessageSender {
    public void sendMessage(String content, OnMessageListener listener) {
        listener.onReceive(content);
    }
}
