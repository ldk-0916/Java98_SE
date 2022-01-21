package com.yys.demo05_创建删除功能的方法;

import java.io.File;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/14:03
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            创建删除功能的方法
                - `public boolean createNewFile()` ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
                - `public boolean delete()` ：删除由此File表示的文件或目录。
                - `public boolean mkdir()` ：创建由此File表示的目录。
                - `public boolean mkdirs()` ：创建由此File表示的目录，包括任何必需但不存在的父目录。

                创建一个文件夹mkdir;创建多层用mkdirs;
         */

        //创建文件夹
        File f1 = new File("ddd\\a.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);//true 当aaa文件不存在的时候,帮我们创建一个新的文件

        //创建文件
        File f2 = new File("File类_流\\aaa\\bbb");
        System.out.println("是否创建成功:"+f2.createNewFile());//true

        //创建文件夹
        File f3 = new File("File类_流\\aaa\\ccc");
        System.out.println("是否创建成功:"+f3.mkdir());//true

        File f4 = new File("File类_流\\aaa\\ddd.txt");
        System.out.println("是否创建成功:"+f4.mkdir());//true

        File f5 = new File("File类_流\\aaa\\ddd\\eee");
        System.out.println("是否创建成功:"+f5.mkdirs());//true
        System.out.println("=================================================");

        //删除文件
        File f6 = new File("File类_流\\aaa\\a.txt");
        System.out.println("是否删除成功:" + f6.delete());//true

        //删除文件夹
        File f7 = new File("File类_流\\aaa\\ddd.txt");
        System.out.println("是否删除成功:" + f7.delete());

        File f8 = new File("File类_流\\aaa\\ddd\\eee");
        System.out.println("是否删除成功:" + f8.delete());

        //无法删除,因为文件夹里面还有东西(还有一个sss文件);必须保证文件夹为空才能删除
        File f9 = new File("File类_流\\aaa\\ccc");
        System.out.println("是否删除成功:" + f9.delete());//false
    }
}
