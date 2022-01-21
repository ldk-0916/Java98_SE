package com.yys.demo14_FileInputStream类;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/13:49
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        /*
            字节数组读取
            read(byte[] b):从该输入流读取最多b.length个字节的数据为字节数组

         */
        //创建字节输入流对象,关联目的地文件路径
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\b.txt");
        //创建存储字节数据的数组,把读取出来的数据放进去
        byte[] b = new byte[100];
        /*//读取数据
        int len1 = fis.read(b);
        System.out.println("数组转换成字符串:" + new String(b,0,len1));
        int len2 = fis.read(b);
        System.out.println("数组转换成字符串:" + new String(b,0,len2));*/
        //int len3 = fis.read(b);
        //System.out.println("数组转换成字符串:" + new String(b,0,len3));//为-1;并且报数组下标越界异常StringIndexOutOfBoundsException

        //定义一个int类型的变量,用来存储读取到的字节数据
        int s;
        while((s = fis.read(b)) !=-1){
            System.out.println(new String(b,0,s));
        }
    }
}
