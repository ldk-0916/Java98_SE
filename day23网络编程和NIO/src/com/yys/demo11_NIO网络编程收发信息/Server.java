package com.yys.demo11_NIO网络编程收发信息;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/13:58
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //获取ServerSocketChannel对象
        ServerSocketChannel ssc = ServerSocketChannel.open();

        //绑定端口号
        ssc.bind(new InetSocketAddress(666));

        //接受请求
        SocketChannel sc = ssc.accept();

        //创建字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(1024);

        //接收客户端数据
        int read = sc.read(b);
        System.out.println(new String(b.array(),0,read));

        //释放资源
        ssc.close();
    }
}
