package com.yys.demo04_判断功能的方法;

import java.io.File;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/13:34
 */
public class Test {
    public static void main(String[] args) {
        /*
            exist():判断文件或者目录是否真实存在
            isDirectory():此File是否为目录
            isFile():此File是否为文件
         */
        //创建file对象
        File f1 = new File("D:\\workspace\\idea_workspace98\\day21\\aaa\\hb.jpg");
        System.out.println("f1表示的文件是否真实存在" + f1.exists());
        System.out.println("f1表示的文件是否为目录" + f1.isDirectory());
        System.out.println("f1表示的文件是否为文件" + f1.isFile());

        System.out.println("============================================");
        File f2 = new File("D:\\workspace\\idea_workspace98\\day21\\aaa");
        System.out.println("f2表示的文件是否真实存在" + f2.exists());//true
        System.out.println("f2表示的文件是否为目录" + f2.isDirectory());//true
        System.out.println("f2表示的文件是否为文件" + f2.isFile());//false

        //文件不存在
        File f3 = new File("D:\\workspace\\idea_workspace98\\day21\\bbb");
        System.out.println("f3表示的文件是否真实存在:" + f3.exists());//false
        System.out.println("f3表示的文件是否为目录:" + f3.isDirectory());//false
        System.out.println("f3表示的文件是否为文件:" + f3.isFile());//false
    }
}
