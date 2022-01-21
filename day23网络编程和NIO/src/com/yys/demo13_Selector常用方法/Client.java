package com.yys.demo13_Selector常用方法;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/15:08
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //获取SocketChannel对象
        SocketChannel sc = SocketChannel.open();

        //连接服务器
        sc.connect(new InetSocketAddress("127.0.0.1",666));

        //创建ByteBuffer缓冲数组
        ByteBuffer b = ByteBuffer.allocate(1024);

        //position设置为0
        b.flip();

        //写出数据
        sc.write(b);

        //关闭资源
        sc.close();
    }
}
