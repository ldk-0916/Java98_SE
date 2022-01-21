package com.yys.demo05_Lambda表达式的格式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/10:32
 */
@FunctionalInterface//函数式接口
public interface A {
    void method();
}
//编译报错,不是函数式接口
/*
@FunctionalInterface
interface B{
    void method1();
    void method2();
}*/
