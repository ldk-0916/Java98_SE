package com.yys.demo08_FileChannel类的基本使用;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/9:18
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
            我们将通过CopyFile这个示例让大家体会NIO的操作过程。CopyFile执行三个基本的操作：
            创建一个Buffer，然后从源文件读取数据到缓冲区，然后再将缓冲区写入目标文件。
         */
        //需求:完成文件复制hb.jpg
        //使用FileChannel类中方法读取文件数据到字节缓冲数组,然后再写入到目的地文件
        //创建字节输入流,关联目的地文件路径
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\hb.jpg");
        //获取fFileChannel对象
        FileChannel fc1 = fis.getChannel();
        //创建字节输出流,关联目的地文件路径
        FileOutputStream fos = new FileOutputStream("File类_流\\aaa\\hbCopy.jpg");
        FileChannel fc2 = fos.getChannel();
        //创建字节缓冲数组,用来存储读取到的字节数据
        ByteBuffer b = ByteBuffer.allocate(1024);
        //循环读取
        while ((fc1.read(b)) != -1){
            //重置position,让他为0,容量和限制为1024
            b.flip();
            //循环读取
            fc2.write(b);
            b.clear();//为了方便下一次循环使用
        }

        //关闭流
        fc2.close();
        fc1.close();
        fos.close();
        fis.close();

    }
}
