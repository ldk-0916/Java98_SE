package com.yys.demo09多态时访问成员特点;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/9:29
 */
public class Dog extends Animal {
    int num = 20;
    public void method1(){
        System.out.println("Dog的非静态方法...method1");
    }
    public static void method2(){
        System.out.println("Dog的静态方法...method2");
    }

    //独有的方法
    public void method3(){
        System.out.println("Dog的成员方法..");
    }
}
