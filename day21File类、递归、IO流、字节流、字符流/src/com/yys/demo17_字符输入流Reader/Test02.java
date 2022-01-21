package com.yys.demo17_字符输入流Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/15:34
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        /*
            读取数据:
                read():读取一个字符数据(输入流)
         */
        FileReader fr = new FileReader("File类_流\\ccc\\a.txt");

        //定义一个变量,用来接收读取的数据
        int len;
        while ((len = fr.read()) != -1){
            System.out.print((char) len);
        }

        //关闭流
        fr.close();
    }
}
