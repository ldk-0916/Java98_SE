package com.yys.demo01_File类的概述和构造方法;

import java.io.File;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/9:55
 */
public class Test {
    public static void main(String[] args) {
        /*
            File类的概述:
                概述:`java.io.File` 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
                构造方法:
                    public File(String pathname) ` ：通过将给定的**路径名字符串**转换为抽象路径名来创建新的 File实例。
                    public File(String parent, String child) ` ：从**父路径名字符串和子路径名字符串**创建新的 File实例。
                    public File(File parent, String child)` ：从**父抽象路径名和子路径名字符串**创建新的 File实例。
                注意:
                    1.一个File对象代表硬盘中的一个文件或者目录
                    2.无论该路径下是否存在文件或者目录,都不影响File对象的创建
         */
        //创建File对象表示一个H:\aaa\hb.jpg文件路径
        File f1 = new File("H:\\aaa\\hb.jpg");
        File f2 = new File("H:\\aa","hb.jpg");
        File parent = new File("H:\\aaa");
        File f3 = new File(parent,"hb.jpg");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        //创建文件(路径不存在的)
        File f4 = new File("H:\\aaa\\b.txt");//b.txt文件是不存在的
        System.out.println(f4);
    }
}
