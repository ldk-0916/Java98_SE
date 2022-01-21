package com.yys.demo12_FileOutputStream类;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/10:50
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
            FileOutputStream类写出数据:
            write(byte[] b);将b.length字节从指定的字节相关的数组写入此输出流
            close()
         */
        //创建字节输出流对象,关联目的地文件路径(你要写入到那个文件里面)
        FileOutputStream fos = new FileOutputStream("File类_流\\bbb\\b.txt");
        //创建字节数字,存储字节数据
        byte[] b = {97,98,99,100,65,66};
        //写出数据到指定文件
        fos.write(b);

        //关闭流
        fos.close();
    }
}
