package com.Innerclassexercise;

public class Exercise03 {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();
        messageSender.sendMessage("Hello from Anonymous Class", new OnMessageListener() {
            public void onReceive(String msg) {
                System.out.println(msg);
            }
        });
    }
}
