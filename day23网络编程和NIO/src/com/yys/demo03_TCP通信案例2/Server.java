package com.yys.demo03_TCP通信案例2;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/10:45
 */
public class Server {
    public static void main(String[] args) throws IOException {
        /*
             * 创建ServerSocket对象并指定端口号(相当于开启了一个服务器)
             * 调用ServerSocket对象的accept方法等待客端户连接并获得对应Socket对象
             * 调用Socket对象的getInputStream方法获得字节输入流对象
             * 调用字节输入流对象的read方法读取客户端发送的数据
             * 调用Socket对象的getOutputStream方法获得字节输出流对象
             * 调用字节输出流对象的write方法往客户端输出数据
             * 关闭Socket和ServerSocket对象
         */
        //1.创建服务器对象,指定端口号
        ServerSocket ss = new ServerSocket(12345);

        //2.调用accept对象
        Socket socket = ss.accept();



        //3.获取输入流,通过socket来获取
        InputStream is = socket.getInputStream();
        //4.读取客户端数据
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println(new String(bys,0,len));

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String str = sc.nextLine();
        //5,获取字节输出流对象
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());
        //关闭
        ss.close();

    }
}
