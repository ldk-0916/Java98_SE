package com.yys.demo10_文件搜索;

import java.io.File;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/9:14
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求:输出dya19_多线程\\src目录中的所有.java文件的绝对路径
            分析:
                1.定义一个方法,用来获取一个目录中所有符合条件的文件(子文件,子子文件,子子子文件...)
                2.在方法中,获取该目录下的所有子文件和子目录
                3.在方法中,循环遍历获取到的所有字文件和子目录
                4.在方法中,遍历的时候,需要判断遍历出来的是文件还是目录
                5.如果是文件,就判断该文件是否以.java结尾,如果是就获取其绝对路径打印输出
                6.如果是文件夹,就递归调用该方法
         */
        File f = new File("day19多线程\\src");
        searchJavaFile(f);
    }
    public static void searchJavaFile(File file){
        //1.定义一个方法,用来获取一个目录中所有符合条件的文件(子文件,子子文件,子子子文件...)
        File[] arr = file.listFiles();

        //2.遍历所有的子文件和子文件
        if (arr != null){
            for (File files : arr) {
                //3.进行判断出来的元素
                //4.如果遍历出来的是文件,而且以.java结尾,就获取其绝对路径打印输出
                if (files.isFile() && files.getName().endsWith(".java")){
                    System.out.println(files.getAbsolutePath());
                }
                //5.如果是文件夹就调用递归
                if (files.isDirectory()){
                    searchJavaFile(files);
                }
            }
        }
    }
}
