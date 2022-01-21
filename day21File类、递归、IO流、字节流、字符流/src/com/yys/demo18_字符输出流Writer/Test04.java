package com.yys.demo18_字符输出流Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/16:20
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //写出字符串
        FileWriter fw = new FileWriter("File类_流\\ddd\\a.txt");
        String str = "法外狂徒张三大战哥斯拉";
        fw.write(str);
        fw.write(str,1,3);
        //关闭资源
        fw.close();
    }
}
