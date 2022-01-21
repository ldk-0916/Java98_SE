package com.yys.demo18_字符输出流Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/16:06
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        /*
            写出字符:write(int b)每一次可以写出一个字符数据
            一定要关闭流

            写出字符数组:
          public void write(char[] b)`：将 b.length字符从指定的字符数组写出此输出流。
          public abstract void write(char[] b, int off, int len)` ：从指定的字符数组写出 len字符，从偏移量 off开始输出到此输出流
         */
        FileWriter fw = new FileWriter("File类_流\\ddd\\c.txt");
        //写出单个字符
        fw.write('a');
        fw.write('e');

        //关闭流

        //创建字符输出流对象
        FileWriter fw1 = new FileWriter("File类_流\\ddd\\d.txt");
        //创建字符数组
        char[] chs = {'你','好','我','是','张','三'};
        fw1.write(chs);
        fw1.write(chs,0,2);

        fw1.close();
        fw.close();
    }
}
