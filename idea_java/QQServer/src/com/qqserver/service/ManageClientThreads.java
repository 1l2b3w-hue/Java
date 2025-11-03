package com.qqserver.service;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 该类用于管理与客户端通信的线程
 */
public class ManageClientThreads {
    private static HashMap<String,ServerConnectClientThread> hm =  new HashMap<>();

    public static HashMap<String, ServerConnectClientThread> getHm() {
        return hm;
    }

    // 添加线程对象到 hm 集合
    public static void addClientThread(String userId,ServerConnectClientThread serverConnectClientThread) {
        hm.put(userId,serverConnectClientThread);
    }

    // 通过userId 获取对应线程
    public static ServerConnectClientThread getServerConnectClientThread(String userId){
        return hm.get(userId);
    }

    // 获取集合中所有线程的 userId(key)
    public static String getOnlineUsers(){
        Iterator<String> iterator = hm.keySet().iterator();
        String onlineUserList = "";
        while(iterator.hasNext()) {
            onlineUserList += iterator.next().toString() + " ";
        }
        return onlineUserList;
    }

    // 从集合中移除某个线程
    public static void removeClientThread(String userId) {
        hm.remove(userId);
    }


}
