package com.api;
//演示 InetAddress 类的使用
//实现了 Serializable 接口，可序列化

import java.net.InetAddress;

public class API_ {
    public static void main(String[] args) throws Exception {

//        获取本机的 InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost); //DESKTOP-IVOIN75/10.100.1.112

        // 根据指定的主机名，获取 InetAddress 对象
        InetAddress host1 = InetAddress.getByName("DESKTOP-IVOIN75");
        System.out.println("host1 = " + host1);

        // 根据一个域名(getByName)，来获取 InetAddress 对象
        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println("baidu = " + baidu); //www.baidu.com/183.2.172.177 (域名 + ip)

        // 根据一个 InetAddress 对象，获取对应对象的 IP 地址
        String address = baidu.getHostAddress();
        System.out.println("baidu 的 ip 地址为 " + address);

        // 通过一个 InetAddress 对象， 获取对应对象的主机名或域名
        String hostName = baidu.getHostName();
        System.out.println("百度的域名为 " + hostName);
    }

}
