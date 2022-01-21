package com.yys.demo13_Selector常用方法;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/15:04
 */
public class Server2 {
    public static void main(String[] args) throws IOException {
        /*
           Selector的keys()方法:
            获取所有被注册的服务器Channel对象的Set集合
                该Set集合中的元素类型是SelectionKey,该SelectionKey类其实就是对Channel的一个封装
         */
        ServerSocketChannel ssc1 = ServerSocketChannel.open();
        ServerSocketChannel ssc2 = ServerSocketChannel.open();
        ServerSocketChannel ssc3 = ServerSocketChannel.open();

        //绑定端口号
        ssc1.bind(new InetSocketAddress(666));
        ssc2.bind(new InetSocketAddress(777));
        ssc3.bind(new InetSocketAddress(888));

        //设置为非阻塞
        ssc1.configureBlocking(false);
        ssc2.configureBlocking(false);
        ssc3.configureBlocking(false);

        //获取选择器
        Selector selector = Selector.open();

        //注册到选择器上面
        ssc1.register(selector, SelectionKey.OP_ACCEPT);
        ssc2.register(selector, SelectionKey.OP_ACCEPT);
        ssc3.register(selector, SelectionKey.OP_ACCEPT);

        Set<SelectionKey> keys = selector.selectedKeys();
        System.out.println("所有已连接个数"+keys.size());

        Set<SelectionKey> selectorKey = selector.keys();
        System.out.println("获取被注册的服务器的个数"+selectorKey.size());

        while (true){
            System.out.println(1);
            selector.select();
        }

    }
}
