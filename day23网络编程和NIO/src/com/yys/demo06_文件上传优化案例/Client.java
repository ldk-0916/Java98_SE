package com.yys.demo06_文件上传优化案例;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/14:22
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket socket = new Socket("127.0.0.1",12312);
        //获取字节输出流对象
        OutputStream os = socket.getOutputStream();
        //创建字节输入流对象,关联数据源文件路径
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\hb.jpg");
        //定义一个字节数组来接收读取到的数据...
        byte[] bys = new byte[1024];
        //定义一个变量
        int len;
        //循环读取
        while ((len = fis.read(bys)) != -1){
            os.write(bys,0,len);
        }

        //文件上传时,客户端从文件读取数据,读取不到就会停止发送
        //但是服务器不知道客户端停止了写数据,所以会一直等待接收客户端写来的数据
        //解决办法:在客户端加上shutdownOutput;通知服务端发送结束
        socket.shutdownOutput();
        //同过socket对象,获取输入流
        InputStream is = socket.getInputStream();
        int read = is.read(bys);//卡死
        System.out.println(new String(bys,0,read));

        //关闭流
        socket.close();
        fis.close();
    }
}
