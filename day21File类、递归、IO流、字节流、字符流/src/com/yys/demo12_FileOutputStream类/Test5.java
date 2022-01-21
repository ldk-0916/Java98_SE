package com.yys.demo12_FileOutputStream类;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/11:02
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        /*
            数据追加续写:
                public FileOutputStream(File file, boolean append)`： 创建文件输出流以写入由指定的 File对象表示的文件。
                public FileOutputStream(String name, boolean append)`： 创建文件输出流以指定的名称写入文件。

              注意:
                1.创建字节输出流对象,必须传入一个文件路径
                2.如果有该文件,就会清空数据,,没有该文件就会创建文件
                3.如果文件存在,并且第二个参数为true,就不清空(保留),反之就清空,默认为false
         */
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("File类_流\\bbb\\a.txt",true);
        //写出数据
        fos.write(102);
        fos.close();
    }
}
