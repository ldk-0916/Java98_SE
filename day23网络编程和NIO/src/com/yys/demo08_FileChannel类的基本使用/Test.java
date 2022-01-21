package com.yys.demo08_FileChannel类的基本使用;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/9:12
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            FileChannel类:
                概述:作用就是用来读写文件的,可以把它看成IO中的输入和输出流(双向通道)
              怎么获取FileChannel类:
                我们可以通过FileInputStream和FileOutputStream的getChannel()方法方便的获取一个它的子类对象。
         */
        //通过输入流获取
        FileInputStream fis = new FileInputStream("ddd\\a.txt");
        FileChannel fc1 = fis.getChannel();
        //输出流获取
        FileOutputStream fos = new FileOutputStream("ddd\\b.txt");
        FileChannel fc2 = fos.getChannel();
    }
}
