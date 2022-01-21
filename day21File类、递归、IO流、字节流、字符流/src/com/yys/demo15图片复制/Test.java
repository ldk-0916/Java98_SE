package com.yys.demo15图片复制;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/14:12
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            1.创建字节输入流和输出流对象,并关联目的地路径
            2.定义一个变量用来存储读出来的数据
            3.循环读取
            4.写进数据
            5,关闭流
         */
        //创建输入流对象(把他读取出来存储-->硬盘),并关联目的地路径
        /*FileInputStream fis = new FileInputStream("File类_流\\aaa\\hb.jpg");

        //创建输出流对象....
        FileOutputStream fos = new FileOutputStream("File类_流\\bbb\\hbCopy.jpg");

        //2.定义一个变量
        int len;
        while ((len = fis.read()) != -1){
            //写进去
            fos.write(len);
        }
        //关闭流
        fos.close();
        fis.close();*/
        //创建输入流对象(把他读取出来存储-->硬盘),并关联目的地路径
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\hb.jpg");

        //创建输出流对象....
        FileOutputStream fos = new FileOutputStream("File类_流\\bbb\\hbCopy2.jpg");
        //定义一个字节数组,用来存储读取出来的数据
        byte[] bys = new byte[1024];

        //定义一个变量,用来存储读取到的数据
        int len;
        while ((len = fis.read(bys)) != -1){
            //循环中写出数据
            fos.write(bys,0,len);
        }
        //关闭流
        fos.close();
        fis.close();
    }
}
