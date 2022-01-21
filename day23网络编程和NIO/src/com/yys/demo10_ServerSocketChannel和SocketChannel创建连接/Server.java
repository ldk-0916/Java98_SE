package com.yys.demo10_ServerSocketChannel和SocketChannel创建连接;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/13:36
 */
public class Server {
    public static void main(String[] args) throws IOException {
        /*
            服务器端:
                ServerSocketChannel类用于连接的服务器端，它相当于：ServerSocket。
                    1)调用ServerSocketChannel的静态方法open(),就可以获得ServerSocketChannel对象,但是并没有指定端口号
                    必须通过其接字的bind()方法,才能将其绑定到特定地址,才能接收连接

                    调用ServerSocketChannel的实例方法bind(SocketAddress add)：绑定本机监听端口，准备接受连接。
        ​
                    注：java.net.SocketAddress(抽象类)：代表一个Socket地址。
        ​              我们可以使用它的子类：java.net.InetSocketAddress(类)
        ​			   构造方法：InetSocketAddress(int port)：指定本机监听端口。
         */
        //获得对象
        ServerSocketChannel ssc = ServerSocketChannel.open();
        //绑定端口号
        ssc.bind(new InetSocketAddress(1234));
        System.out.println("等待连接......................");
        //设置非阻塞
        //ssc.configureBlocking(false);//如果为true那么这个通道将被设置为阻塞模式;反之为非阻塞模式

        //接收
        while (true){
            SocketChannel sc = ssc.accept();
            if (sc == null){
                System.out.println("没有连接上...");
            }else {
                System.out.println("连接成功...");
                break;
            }
        }
    }
}
