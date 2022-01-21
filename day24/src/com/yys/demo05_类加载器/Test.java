package com.yys.demo05_类加载器;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/9:56
 */
public class Test {
    public static void main(String[] args) {
        /*
            类加载器:
                概述:是负责将磁盘上的某个class文件读取到内存并生成Class的对象。
                如何获取类的加载器?
                类的字节码对象.getClassLoader()
         */
        //获取Test类的加载器
        ClassLoader cl = Test.class.getClassLoader();
        System.out.println(cl);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取Student类的加载器
        ClassLoader c2 = Student.class.getClassLoader();
        System.out.println(c2);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取String类的加载器
        ClassLoader c3 = String.class.getClassLoader();
        System.out.println(c3);//null

        //委派机制
        System.out.println(cl.getParent());//PlatformClassLoader
        System.out.println(cl.getParent().getParent());
    }
}
