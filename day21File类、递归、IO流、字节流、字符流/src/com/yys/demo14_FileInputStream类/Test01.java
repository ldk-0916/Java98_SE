package com.yys.demo14_FileInputStream类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/11:17
 */
public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
           FileInputStream类:
               概述:是InputStream的子类,用这个表示文件输入流,从文件中读取字节
               FileInputStream类的构造方法
                FileInputStream(File file)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的文件对象 file命名。
                FileInputStream(String name)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。

                注意:
                1.当你创建一个输入流对象时,必须传入文件路径
                2.该路径下,如果文件不存在,会抛出FileNotFoundException
         */

        File f = new File("File类_流\\ccc");
        System.out.println(f.mkdir());
        //创建字节输入流,关联目的地文件路径
        FileInputStream fis1 = new FileInputStream("File类_流\\bbb\\a.txt");
        FileInputStream fis2 = new FileInputStream(new File("File类_流\\bbb\\a.txt"));
        //如果文件不存在
        //FileInputStream fis3 = new FileInputStream("File类_流\\ccc\\b.txt");报异常:FileNotFoundException
    }
}
