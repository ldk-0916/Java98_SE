package com.yys.demo16_commons_io工具包;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/12/9:55
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            - commons-io提供了一个工具类  org.apache.commons.io.IOUtils，封装了大量IO读写操作的代码。其中有两个常用方法：
             1. public static int copy(InputStream in, OutputStream out)； 把input输入流中的内容拷贝到output输出流中，返回拷贝的字节个数(适合文件大小为2GB以下)
             2. public static long copyLarge(InputStream in, OutputStream out)；把input输入流中的内容拷贝到output输出流中，返回拷贝的字节个数(适合文件大小为2GB以上)


- common-io还提供了一个工具类org.apache.commons.io.FileUtils，封装了一些对文件操作的方法：
    1. public static void copyFileToDirectory(final File srcFile, final File destFile) //复制文件到另外一个目录下。
    2. public static void copyDirectoryToDirectory( file1 , file2 );//复制file1目录到file2位置。
         */
        //IOUtils工具类拷贝文件
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\ddd\\hb.jpg");
        FileOutputStream fos = new FileOutputStream("File类_流\\aaa\\ddd\\hbCopy.jpg");
        IOUtils.copy(fis,fos);
        fos.close();
        fis.close();
        method();
    }
    public static void method() throws IOException {
        //FileUtils工具类拷贝文件到指定文件夹
        File f1 = new File("File类_流\\aaa\\ddd");
        File f2 = new File("File类_流\\aaa\\eee");
        //FileUtils.copyFileToDirectory(f1,f2);
        FileUtils.copyDirectoryToDirectory(f1,f2);
    }
}
