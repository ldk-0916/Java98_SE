package com.yys.demo14_FileInputStream类;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/13:38
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        /*
            FileInputStream类读取数据
                read()
         */
        //创建字节输入流对象,关联目的地文件路径
        FileInputStream fis = new FileInputStream("File类_流\\bbb\\a.txt");
        //读取一个字节:
      /*  int len1 = fis.read();
        System.out.println((char)len1);//102->f
        int len2 = fis.read();
        System.out.println((char)len2);//d
        int len3 = fis.read();
        System.out.println((char)len3);//g
        int len4 = fis.read();
        System.out.println((char)len4);//h*/

        //定义一个int类型的变量len,专门用来存储读取到的字节
        int len;
        while ((len = fis.read()) != -1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
