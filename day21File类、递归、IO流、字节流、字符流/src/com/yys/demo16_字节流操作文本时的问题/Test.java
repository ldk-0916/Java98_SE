package com.yys.demo16_字节流操作文本时的问题;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/15:16
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //需求:使用字节流读取bbb\\a.txt文件中的每个字符并打印到控制台
        /*
            存在读取中文时出现乱码问题
         */
        //创建字节流对象,关联数据源
        FileInputStream fis = new FileInputStream("File类_流\\bbb\\a.txt");
        //定义一个int变量
        int len ;
        while ((len = fis.read()) != -1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
