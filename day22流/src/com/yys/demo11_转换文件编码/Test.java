package com.yys.demo11_转换文件编码;

import java.io.*;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/15:16
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            将GBK编码文件转为UTF-8编码的文件
                1.指定GBK编码的转换流,读取文本文件
                2.使用UTF-8编码的转换流,写出文本
         */
        //创建转换流对象指定为GBK格式
        FileInputStream fis = new FileInputStream("File类_流\\ddd\\e.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");

        //2.创建转换输出流对象,转为utf-8
        FileOutputStream fos = new FileOutputStream("File类_流\\ddd\\utf-8.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        //定义一个变量
        int len;
        //读取数据
        while ((len = isr.read()) != -1){
            //写出数据
            osw.write((char) len);
        }
        //关闭资源
        osw.close();
        isr.close();
    }
}
