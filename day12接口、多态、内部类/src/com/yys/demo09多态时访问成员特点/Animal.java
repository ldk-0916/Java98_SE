package com.yys.demo09多态时访问成员特点;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/9:27
 */
public class Animal {
    int num = 10;
    public void method1(){
        System.out.println("Animal的非静态方法...method1");
    }
    public static void method2(){
        System.out.println("Animal的静态方法...method2");
    }
}
