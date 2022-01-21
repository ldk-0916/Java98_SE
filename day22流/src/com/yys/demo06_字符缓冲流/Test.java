package com.yys.demo06_字符缓冲流;

import java.io.*;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/11:13
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            字符缓冲流
                构造方法:
                        public BufferedReader(Reader in) ：创建一个 新的缓冲输入流。
                        public BufferedWriter(Writer out) ： 创建一个新的缓冲输出流。
                 特有方法:
                         BufferedReader：`public String readLine()`: 读一行文字。
                         BufferedWriter：`public void newLine()`: 写一行行分隔符,由系统属性定义符号。
         */
        //字符缓冲输入流读文本
        FileWriter fw = new FileWriter("File类_流\\aaa\\c.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        //写出数据
        bw.write("赠船夫");
        bw.newLine();
        bw.write("李白乘舟不给钱,");
        bw.newLine();
        bw.write("船夫一脚踢下船.");
        bw.newLine();
        bw.write("挑花潭水深千尺,");
        bw.newLine();
        bw.write("不知李白死没死");
        bw.newLine();
        bw.write("横批-爽的一批");
        bw.close();
        method();
    }
    public static void method() throws IOException {
        FileReader fr = new FileReader("File类_流\\aaa\\c.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
