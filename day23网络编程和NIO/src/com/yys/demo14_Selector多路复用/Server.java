package com.yys.demo14_Selector多路复用;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/15:34
 */
public class Server {
    public static void main(String[] args) throws IOException {
        /*
            需求:使用Selector进行多路复用,监听3个服务器端口
            分析:
                - 创建3个服务器通道,设置成非阻塞
                - 获取Selector选择器
                - 把Selector注册到三个服务器通道上
                - 循环去等待客户端连接
                - 遍历所有被连接的服务器通道集合
                - 处理客户端请求
         */
        //获取3个端口号
        ServerSocketChannel ssc1 = ServerSocketChannel.open();
        ServerSocketChannel ssc2 = ServerSocketChannel.open();
        ServerSocketChannel ssc3 = ServerSocketChannel.open();

        //绑定端口号
        ssc1.bind(new InetSocketAddress(666));
        ssc2.bind(new InetSocketAddress(777));
        ssc3.bind(new InetSocketAddress(888));

        //设置成非阻塞
        ssc1.configureBlocking(false);
        ssc2.configureBlocking(false);
        ssc3.configureBlocking(false);

        //获取选择器
        Selector selector = Selector.open();

        //注册到选择器上面
        ssc1.register(selector, SelectionKey.OP_ACCEPT);
        ssc2.register(selector, SelectionKey.OP_ACCEPT);
        ssc3.register(selector, SelectionKey.OP_ACCEPT);

        while (true){
            System.out.println(1);
            //服务器等待连接
            selector.select();//阻塞
            System.out.println(2);

            //处理客户端请求
            //获取已连接的Channel通道
            Set<SelectionKey> keys = selector.selectedKeys();
            //遍历已连接的通道
            /*for (SelectionKey key : keys) {
                //转换成ServerSocketChannel对象
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                //处理客户端请求
                SocketChannel sc = ssc.accept();
                ByteBuffer b = ByteBuffer.allocate(1024);
                int len = sc.read(b);
                System.out.println(new String(b.array(),0,len));
                sc.close();

                    *//*- 问题: Selector把所有被连接的服务器对象放在了一个Set集合中,但是使用完后并没有删除,
                        导致在遍历集合时,遍历到已经没用的对象,出现了异常
                - 解决办法: 使用完了,应该从集合中删除,由于遍历的同时不能删除,所以使用迭代器进行遍历*//*

            }*/

            //迭代器遍历
            Iterator<SelectionKey> it = keys.iterator();
            while (it.hasNext()){
                SelectionKey key = it.next();
                //转换成ServerSocketChannel对象
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                //处理客户端请求
                SocketChannel sc = ssc.accept();
                ByteBuffer b = ByteBuffer.allocate(1024);
                int len = sc.read(b);
                System.out.println(new String(b.array(),0,len));
                sc.close();
                it.remove();
            }
        }
    }
}
