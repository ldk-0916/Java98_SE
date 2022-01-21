package com.yys.demo12_FileOutputStream类;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/10:39
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
            写出数据:
                    FileOutputStream写出相关数据
                    write(int b):每次可以写出一个字节数据
                    close():关闭流
         */
        //创建文件
       /* File f = new File("File类_流\\bbb");
        System.out.println(f.mkdir());*/
        //创建字节输出流对象,关联目的文件路径(我们要写到的文件路径)
        FileOutputStream fos = new FileOutputStream("File类_流\\bbb\\a.txt");
        fos.write(97);
        fos.write(98);
        fos.write(65);

        //关闭资源
        fos.close();
    }
}
