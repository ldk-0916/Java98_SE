package com.yys.demo03_TCP通信案例2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/10:44
 */
public class Client {
    public static void main(String[] args) throws IOException {
        /*
             * 创建客户端Socket对象并指定服务器地址和端口号
             * 调用Socket对象的getOutputStream方法获得字节输出流对象
             * 调用字节输出流对象的write方法往服务器端输出数据
             * 调用Socket对象的getInputStream方法获得字节输入流对象
             * 调用字节输入流对象的read方法读取服务器端返回的数据
             * 关闭Socket对象断开连接
         */
        //客户端
        //1.创建客户端Socket对象并指定服务器地址和端口号
        Socket socket = new Socket("127.0.0.1",11111);
        System.out.println(socket);//封装了服务器地址和端口号

        //2.通过socket对象获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("服务器你好,我是甲方爸爸客户端".getBytes());
        //3.读取服务端写来的数据
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int read = is.read(bys);
        System.out.println(new String(bys,0,read));
        socket.close();
    }
}
