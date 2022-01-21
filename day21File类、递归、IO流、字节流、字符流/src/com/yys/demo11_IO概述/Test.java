package com.yys.demo11_IO概述;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/9:27
 */
public class Test {
    public static void main(String[] args) {
        /*
            IO概述:
                I: Input  表示输入:从其他存储设备 读取数据 到内存中
                O: Output 表示输出:从内存中 写出数据 到其他存储设备中

            IO的分类:
                按类型分:
                    字节流:以字节为基本单位进行读写数据
                        字节输入流:以字节为基本单位进行读数据
                        字节输出流:以字节为基本单位进行写数据
                    字符流:以字符为基本单位进行读写数据
                        字符输出流:以字符为基本单位进行读数据
                        字符输出流:以字符为基本单位进行写数据

                按流向分:
                    输入流:
                        字节输入流:...
                        字节输出流:...
                    输出流:

                按照IO的父类:
                    字节输入流:顶层父类是InputStream抽象类,常见的子类FileInputStream
                    字节输出流:顶层父类是OutputStream抽象类,常见的子类FileOutputStream
                    字符输入流:顶层父类是Reader抽象类,常见子类FileReader
                    字符输出流:顶层父类是Writer抽象类,常见子类FileWriter

                注意:
                    1.idea默认的编码utf-8
                    2.gbk编码格式一个中文占2个字节,utf-8编码一个中文占3个字节
                    3.如果存取编码不一致,就会导致乱码
         */
    }
}
