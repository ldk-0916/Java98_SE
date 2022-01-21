package com.yys.demo01_InetAddress类;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/9:36
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            InetAddress类:
                概述:一个该类对象就表示一个ip地址对象

                InetAdddress:
                * static InetAddress getLocalHost()   获得本地主机IP地址对象
                * static InetAddress getByName(String host) 根据IP地址字符串或主机名获得对应的IP地址对象
                * String getHostName();获得主机名
                * String getHostAddress();获得IP地址字符串
             */
        //获取本机地址
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println("本机地址:" + ip1);//LAPTOP-RK3IO6HJ/172.19.109.1

        //根据IP地址字符串或主机名获得对应的IP地址对象
        InetAddress ip2 = InetAddress.getByName("LAPTOP-RK3IO6HJ");
        System.out.println(ip2);//LAPTOP-RK3IO6HJ/172.19.109.1

        //获取主机名
        System.out.println(ip1.getHostName());//LAPTOP-RK3IO6HJ

        //获取ip地址字符串
        String hostAddress = ip1.getHostAddress();
        System.out.println(hostAddress);//172.19.109.1

        //获取网络中的地址对象
        InetAddress ip3 = InetAddress.getByName("www.baidu.com");
        System.out.println("远程网络地址对象:" + ip3);

    }

}
