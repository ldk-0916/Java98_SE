package com.yys.demo11_NIO网络编程收发信息;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/13:58
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //获取SocketChannel对象
        SocketChannel sc = SocketChannel.open();

        //连接服务器
        sc.connect(new InetSocketAddress("127.0.0.1",666));

        //创建字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(1024);

        //把数据存储到缓冲数组
        b.put("你好,服务器!".getBytes());

        //position设置为0,
        b.flip();
        //写出数据到服务端
        sc.write(b);

        //释放资源
        sc.close();
    }
}
