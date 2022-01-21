package com.yys.demo12_FileOutputStream类;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/10:55
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        /*
            write(byte[] b, int off, int len):将 len字节从位于偏移量 off的指定字节数组写入此文件输出流
            close():关闭流;
         */
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("File类_流\\bbb\\c.txt");
        //创建字节数组
        byte[] b = {99,100,101,102,103};
        //写出指定范围的字节数组中的字节数据
        fos.write(b,1,2);//off:偏移量  length:长度

        //关闭流
        fos.close();

    }
}
