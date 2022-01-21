package com.yys.demo10_OutputStreamWriter类;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/15:04
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            OutputStreamWriter类(转换流):是Writer子类
            特点:
                1.可以把字节输出流转换为字符输出流
                2.可以指定编码格式,也可以接受默认编码格式
                    OutputStreamWriter(OutputStream in): 创建一个使用默认字符集的字符流。 idea默认的是utf8
                    OutputStreamWriter(OutputStream in, String charsetName): 创建一个指定字符集的字符流。
         */
        //创建转换输出流对象
        FileOutputStream fos = new FileOutputStream("File类_流\\ddd\\a.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //写出数据
        osw.write("张三正在学习java");
        osw.close();
        method();
    }
    //idea中默认的编码格式是utf-8
    public static void method() throws IOException {
        FileOutputStream fos = new FileOutputStream("File类_流\\ddd\\e.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        //写出数据
        osw.write("张三正在学习java");
        osw.close();
    }
}
