package com.yys.demo02_TCP通信案例1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/9:58
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //服务器
        //1.创建ServerSocket对象,并制定端口号(相当于开启了一个服务器);
        ServerSocket ss = new ServerSocket(11111);

        //2.调用accept方法,接收客户端请求,返回socket对象
        Socket socket = ss.accept();
        System.out.println(socket);//封装了客户端的ip地址和端口号

        //3.使用返回的Socket对象获取输入流
        InputStream is = socket.getInputStream();

        //4.读取客户端写过来的数据
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println(new String (bys,0,len));
        //5一般不关闭

    }
}
