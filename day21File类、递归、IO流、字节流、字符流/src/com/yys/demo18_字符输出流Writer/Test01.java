package com.yys.demo18_字符输出流Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/15:54
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        /*
            FileWriter:是Writer的子类,表示字符输出流,用来写出字符流

            构造方法:
                FileWriter(File file)`： 创建一个新的 FileWriter，给定要读取的File对象。
                FileWriter(String fileName)`： 创建一个新的 FileWriter，给定要读取的文件的名称。
                FileWriter(File file,boolean append)`： 创建一个新的 FileWriter，给定要读取的File对象。
                FileWriter(String fileName,boolean append)`： 创建一个新的 FileWriter，给定要读取的文件的名
              注意:
                1.创建一个字符输出流对象时,必须传入一个文件路径
                2.前两个构造方法,如果没有这个文件,会创建一个文件(空的),如果有会清空
                3.后面两个构造方法,如果没有这个文件,会创建一个文件(空的),如果有这个文件,并且第二个参数为true,
                不会清空,如果为false,就清空
         */
        FileWriter fr1 = new FileWriter("File类_流\\ddd\\a.txt",true);
        FileWriter fr2 = new FileWriter("File类_流\\ddd\\b.txt");
    }
}
