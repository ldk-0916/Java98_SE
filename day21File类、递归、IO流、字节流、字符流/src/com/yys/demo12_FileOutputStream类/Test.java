package com.yys.demo12_FileOutputStream类;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/9:49
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            FileOutputStream类:
               FileOutputStream类的概述
                java.io.FileOutputStream `类是OutputStream类的子类,用来表示是文件输出流，用于将数据写出到文件。
               FileOutputStream类的构造方法
                    public FileOutputStream(File file)`：创建文件输出流以写入由指定的 File对象表示的文件。
                    public FileOutputStream(String name)`： 创建文件输出流以指定的名称写入文件。
               注意:
                1.当你创建一个字节输出流对象时,必须传入一个文件路径
                2.该路径下,如果没有这个文件,会创建该文件(空的)
                3.如果有这个文件,会清空这个文件的数据
         */
        //创建字节输出流对象
        FileOutputStream fos1 = new FileOutputStream("File类_流\\aaa\\a.txt");

        FileOutputStream fos2 = new FileOutputStream("File类_流\\aaa\\b.txt");

        FileOutputStream fos3 = new FileOutputStream("File类_流\\aaa\\c.txt");
    }
}
