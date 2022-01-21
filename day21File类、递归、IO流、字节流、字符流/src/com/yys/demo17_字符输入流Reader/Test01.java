package com.yys.demo17_字符输入流Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/15:22
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        /*
            概述:
                `java.io.Reader`抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。它定义了字符输入流的基本共性功能方法。
             构造方法:
                FileReader(File file):创建一个新的FileReader,给定要读取的File对象
                FileReader(String FileName)创建一个新的FileReader,给定要读取的文件名称

             注意:
                1.当你创建字符流对象时,必须从传入一个文件路径
                2.如果该路径下没有文件,会抛出异常:FileNotFoundException找不到文件异常
         */

        //创建字符流对象,关联数据源
        FileReader fr1 = new FileReader("File类_流\\ccc\\a.txt");
        File f = new File("File类_流\\ccc\\b.txt");
        FileReader fr2 = new FileReader(new File("File类_流\\ccc\\a.txt"));
    }
}
