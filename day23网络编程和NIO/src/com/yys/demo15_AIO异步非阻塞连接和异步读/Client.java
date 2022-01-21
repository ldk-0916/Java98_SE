package com.yys.demo15_AIO异步非阻塞连接和异步读;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/15:08
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //获取SocketChannel对象
        AsynchronousSocketChannel sc = AsynchronousSocketChannel.open();

        //连接服务器
        sc.connect(new InetSocketAddress("127.0.0.1",666));

        //创建ByteBuffer缓冲数组
        ByteBuffer b = ByteBuffer.allocate(1024);
        b.put("张三".getBytes());
        //position设置为0
        b.flip();
        Thread.sleep(2000);
        //写出数据
        sc.write(b);

        //关闭资源
        sc.close();
    }
}
