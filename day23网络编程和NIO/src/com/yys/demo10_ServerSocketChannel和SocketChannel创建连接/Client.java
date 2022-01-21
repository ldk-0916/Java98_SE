package com.yys.demo10_ServerSocketChannel和SocketChannel创建连接;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/13:36
 */
public class Client {
    public static void main(String[] args) throws IOException {
        /*
            客户端:
                SocketChannel类:用于连接客户端,相当于socket
                    1)先调用SocketChannel中的open()方法,打开通道
                    2)调用SocketChannel的实例方法connect(SocketAddress aad)连接服务器
         */
        //打开通道
        SocketChannel sc = SocketChannel.open();
        //连接服务器

        sc.connect(new InetSocketAddress("127.0.0.1",1234));
    }
}
