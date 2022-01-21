package com.yys.demo03_File类获取功能的方法;

import java.io.File;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/10:53
 */
public class Test {
    public static void main(String[] args) {
        /*
            获取功能的方法
                    public String getAbsolutePath() ` ：返回此File的绝对路径名字符串。
                    public String getPath()  ：将此File转换为路径名字符串。
                    public String getName()  ：返回由此File表示的文件或目录的名称。
                    public long length()  ：返回由此File表示的文件的字节大小。 不能获取目录的字节大小。(不能放在moudel里面)
         */
        //创建File对象,表示day21\\aaa\\hb.jpg
        File f1 = new File("H\\a\\b.txt");
        System.out.println("f1的绝对路径:" + f1.getAbsolutePath());//f1的绝对路径:D:\workspace\idea_workspace98\H\a.txt
        System.out.println("f1相对路径:" + f1.getPath());//day21\aaa\hb.jpg
        System.out.println("f1的文件名:" + f1.getName());//hb.jpg
        System.out.println("f1的字节大小:" + f1.length());//10

        File f2 = new File("day21\\aaa\\bbb");
        System.out.println(f2.length());
        System.out.println(f1.exists());
    }
}
