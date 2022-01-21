package com.yys.demo18_字符输出流Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/16:23
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        /*
            关闭和刷新
            因为内置缓冲区的原因，如果不关闭输出流，无法写出字符到文件中。但是关闭的流对象，是无法继续写出数据的。如果我们既想写出数据，又想继续使用流，就需要`flush` 方法了。
            - `flush` ：刷新缓冲区，流对象可以继续使用。
            - `close` ：关闭流，释放系统资源。关闭前会刷新缓冲区。

         */
        //创建对象
        FileWriter fw = new FileWriter("File类_流\\ddd\\b.txt");
        fw.write("我是张三");
        //刷新
        fw.flush();
        fw.write("-罗翔");
        fw.flush();

        //关闭流
        fw.close();
        fw.write("你说的对");//Stream closed:流关闭了
    }
}
