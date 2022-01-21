package com.yys.demo02_TCP通信案例1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/9:58
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //客户端
        //1.创建客户端Socket对象并指定服务器地址和端口号
        Socket socket = new Socket("127.0.0.1",11111);
        System.out.println(socket);//封装了服务器地址和端口号

        //通过socket对象获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("服务器你好,我是甲方爸爸客户端".getBytes());
        socket.close();
    }


}
