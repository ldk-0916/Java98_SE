package com.yys.demo06_文件上传优化案例;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/14:22
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12312);
        while (true) {
            //2.调用accept方法,接收客户端发来的请求,得到一个socket对象
            Socket socket = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //3.获取输入流对象,关联目的地文件路径
                        InputStream is = socket.getInputStream();
                        //4.获取输出流对象,关联目的地文件路径,用来写出文件数据到服务端
                        FileOutputStream fos = new FileOutputStream("File类_流\\aaa\\hbCopy3.jpg");
                        //定义一个数组,用来存储读取出来的数据
                        byte[] bys = new byte[1024];
                        //定义一个变量
                        int len;
                        while ((len = is.read(bys)) != -1){
                            fos.write(bys,0,len);
                        }
                        System.out.println("..............................回写数据到客户端............................");
                        //获取输出流对象
                        OutputStream os = socket.getOutputStream();
                        //回应字符串到客户端
                        os.write("文件上传成功了".getBytes());
                        fos.close();

                    }catch (IOException e){

                    }
                }
            }).start();
        }
    }
}
