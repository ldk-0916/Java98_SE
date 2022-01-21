package com.yys.demo04_文件上传案例;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/13:35
 */
public class Client {
    public static void main(String[] args) throws IOException {
        /*
            1. 【客户端】输入流，从硬盘读取文件数据到程序中。
            2. 【客户端】输出流，写出文件数据到服务端。
            3. 【服务端】输入流，读取文件数据到服务端程序。
            4. 【服务端】输出流，写出文件数据到服务器硬盘中。
            5. 【服务端】获取输出流，回写数据。(响应回来的数据)
            6. 【客户端】获取输入流，解析回写数据
         */
        //客户端对象
        Socket socket = new Socket("127.0.0.1",12344);
        //文件输入流,关联文件路径
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\hb.jpg");
        //通过客户端对象获取输出流
        OutputStream os = socket.getOutputStream();

        byte[] bys = new byte[1024];
        //定义一个变量
        int len;
        while ((len = fis.read(bys)) != -1){
            os.write(bys,0,len);
        }

        //关闭流
        socket.close();
        fis.close();
    }
}
