package com.yys.demo12_selector选择器;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/14:20
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
            Selector选择器概述和作用:
                概述:被称为选择器,也被称为多路复用器,可以把多个Channel注册到一个Selector选择器上面,那么就可以利用
                    一个多线程来处理多个Channel上发生的事件,并且能够根据事件情况决定Channel读写
                作用:一个Selector可以监听多个Channel发生的事件,降低cpu使用率,减少体系统负担,提高程序执行效率

             Selector选择器获取:
                通过.open()来获取Selector选择器对象
             Selector选择器注册:
                通过调用 channel.register(Selector sel, int ops)方法来实现注册：
                参数1:表示选择器
                参数2:表示选择器要监听的Channel事件

             以监听四种不同类型的事件，而且可以使用SelectionKey的四个常量表示：
                 1. 连接就绪--常量：SelectionKey.OP_CONNECT
                 2. 接收就绪--常量：SelectionKey.OP_ACCEPT      (ServerSocketChannel在注册时只能使用此项)
                 3. 读就绪--常量：SelectionKey.OP_READ
                 4. 写就绪--常量：SelectionKey.OP_WRITE
            注意：
                1.对于ServerSocketChannel在注册时，只能使用OP_ACCEPT，否则抛出异常。
                2.ServerSocketChannel要设置成非阻塞
         */
        //获取3个端口ServerSocketChannel对象
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
    }
}
