package com.yys.demo05_字节缓冲流;

import java.io.*;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/10:53
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            字节缓冲流的使用:
                特点:读写效率高
                构造方法:
                    public BufferedInputStream(InputStream in)` ：创建一个 新的缓冲输入流。
                    public BufferedOutputStream(OutputStream out)`： 创建一个新的缓冲输出流。
         */
        //拷贝文件测试效率
        //获取当前系统时间
       /* long startTime = System.currentTimeMillis();
        //创建输入流对象
        FileInputStream fis = new FileInputStream("File类_流\\jdk8.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        //创建输出流的对象
        FileOutputStream fos = new FileOutputStream("File类_流\\jdk8Copy.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //读取定义一个数组
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
       *//*while ((len = fis.read(bys)) != -1){
           fos.write(bys,0,len);
       }*//*
        bos.close();
        fos.close();
        //结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时:"+(endTime - startTime)+"毫秒");*/
        method();
    }
    public static void method() throws IOException {
        //获取当前系统时间
        long startTime = System.currentTimeMillis();
        //创建输入流对象
        FileInputStream fis = new FileInputStream("File类_流\\jdk8.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        //创建输出流的对象
        FileOutputStream fos = new FileOutputStream("File类_流\\jdk8Copy.exe");
        BufferedOutputStream bos = new BufferedOutputStream(fos);


        int len;
        /*while ((len = bis.read()) != -1){
            bos.write(len);
        }*/
       while ((len = fis.read()) != -1){
           fos.write(len);
       }
        bos.close();
        fos.close();
        //结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时:"+(endTime - startTime)+"毫秒");
    }
}
