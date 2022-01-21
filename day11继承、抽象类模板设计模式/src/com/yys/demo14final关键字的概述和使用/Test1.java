package com.yys.demo14final关键字的概述和使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/14:00
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            final修饰的局部变量:被final修饰的局部变量只能赋值一次

         */
        final int NUM = 10;//声明赋值;
        //num = 20;//编译报错,因为被final修饰的局部变量只能赋值一次

        final int NUM2;
        NUM2 = 20;
        //num2 = 30;//编译报错,原因同上
        int NUM3 = 10;
        NUM3 = 20;
        System.out.println(NUM3);//20,会覆盖
    }
}
