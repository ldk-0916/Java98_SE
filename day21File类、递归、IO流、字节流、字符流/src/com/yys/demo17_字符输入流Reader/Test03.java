package com.yys.demo17_字符输入流Reader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/15:40
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        /*
            使用字符数组读取文件内容...
            read(char[] char),每次读取多个字符到数组中,返回读取到的有效字符个数,读取到末尾时,返回-1
         */
        //创建字符流对象
        FileReader fr = new FileReader("File类_流\\ccc\\a.txt");
        //创建字符数组,用来存储读取到的数据
        char[] chs = new char[1024];

        //创建一个变量接收读取到的数据
        int len;
        //循环读取
        while ((len = fr.read(chs)) != -1){
            //打印
            System.out.println(new String(chs,0,len));
        }
        //关闭流
        fr.close();
    }
}
