package com.yys.demo12_FileOutputStream类;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/10:29
 */
public class Test_WriteNewLine {
    public static void main(String[] args) throws IOException {
        /*

         */
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("File类_流\\aaa\\a.txt");
        //写出数据
        fos.write("静叶思".getBytes());
        fos.write("\n刘(lou)座\n".getBytes());
        fos.write("\n床前明月光".getBytes());
        fos.write("\n李白打开窗".getBytes());
        fos.write("\n中了x光".getBytes());
        fos.write("\n全家死光光".getBytes());
        fos.write("\n结局好凄凉".getBytes());

    }
}
