package com.yys.demo04_类的加载时机;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/9:44
 */
public class Student {
    static String country;
    static {
        System.out.println("Student静态代码块...");
    }

    public static void method(){
        System.out.println("Student静态方法...");
    }
}
