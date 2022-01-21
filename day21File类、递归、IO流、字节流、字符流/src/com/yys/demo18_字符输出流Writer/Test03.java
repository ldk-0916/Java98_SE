package com.yys.demo18_字符输出流Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/16:18
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
        FileWriter fw1 = new FileWriter("File类_流\\ddd\\d.txt");
        //创建字符数组
        char[] chs = {'你','好','我','是','张','三'};
        fw1.write(chs);
        fw1.write(chs,0,2);

        fw1.close();
    }
}
