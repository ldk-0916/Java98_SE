package com.yys.demo15_AIO异步非阻塞连接和异步读;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/16:07
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //获取异步服务器通道
        AsynchronousServerSocketChannel asc = AsynchronousServerSocketChannel.open();

        //绑定端口号
        asc.bind(new InetSocketAddress(666));

        //异步非阻塞连接
        System.out.println(1);
        asc.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel as, Object attachment) {
                //连接成功
                System.out.println("success");
                //异步获取客户端数据
                ByteBuffer b = ByteBuffer.allocate(1024);
                as.read(b, null, new CompletionHandler<Integer, Object>() {
                    @Override
                    public void completed(Integer len, Object attachment) {
                        //处理成功
                        System.out.println(new String(b.array(),0,len));
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {

                    }
                });
            }

            @Override
            public void failed(Throwable exc, Object attachment) {

            }
        });
    }
}
