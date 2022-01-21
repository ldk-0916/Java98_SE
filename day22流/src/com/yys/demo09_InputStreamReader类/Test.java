package com.yys.demo09_InputStreamReader类;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/14:18
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            InputStreamReader类 :是Reader的子类
            特点:
                1.可以将字节输入流转为字符输入流
                2.指定编码读数据,也可以接受平台默认的字符集
             构造方法:
                    InputStreamReader(InputStream in)`: 创建一个使用默认字符集的字符流。
                    InputStreamReader(InputStream in, String charsetName)`: 创建一个指定字符集的字符流
         */
       /* //创建它的对象
        FileInputStream fis = new FileInputStream("File类_流\\bbb\\a.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        int len;
        //读取数据
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();*/
       method();
    }
    public static void method() throws IOException {
        //指定编码
        FileInputStream fis = new FileInputStream("File类_流\\bbb\\a.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GBK");

        int len;
        //读取数据
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
