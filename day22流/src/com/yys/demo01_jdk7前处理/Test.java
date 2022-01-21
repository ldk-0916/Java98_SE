package com.yys.demo01_jdk7前处理;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/9:07
 */
public class Test {
    public static void main(String[] args) {
        /*
            jdk7之前处理:try...catch...finally
         */
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //字节输入流
             fis = new FileInputStream("File类_流\\ddd\\a.txt");
            //创建字节输出流
             fos = new FileOutputStream("File类_流\\ddd\\copyA.txt");
            //定义一个数组
            byte[] bys = new byte[1024];
            //创建一个变量,存储读取的数据
            int len;
            while ((len = fis.read(bys)) != -1){
                //写出数据
                fos.write(bys,0,len);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                //必须执行的
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
