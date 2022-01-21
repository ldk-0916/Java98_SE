package com.yys.demo02_File类相对绝对路径;

import java.io.File;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/10:41
 */
public class Test {
    public static void main(String[] args) {
        /*
            绝对路径和相对路径
                绝对路径:从盘符的根路径开始,这是一个完整的路径
                相对路径:相对于项目的路径,这是一个便捷的路径,开发中经常使用。必须掌握

                生活中:你在金益二村1栋101,你对象在金逸二村
                你告诉你对象你在哪
                绝对路径:中国江苏省苏州市吴中区金益二村1栋101
                相对路径:1栋101
         */
        //绝对路径
        File f1 = new File("D:\\zs\\a.txt");

        //相对路径
        File f2 = new File("H\\aaa\\hb.jpg");
        System.out.println(f1);
        System.out.println(f2);
    }
}
