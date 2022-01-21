package com.yys.demo08_编码问题;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/13:58
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //创建字符读取gbk编码文件
        FileReader fr = new FileReader("D:\\zs\\a\\b.txt");
        //BufferedReader br = new BufferedReader(fr);
        //定义一个变量
        int len;
        while ((len = fr.read()) != -1){
            System.out.println((char) len);
        }
    }
}
