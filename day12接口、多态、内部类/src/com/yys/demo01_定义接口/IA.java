package com.yys.demo01_定义接口;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/9:43
 */
public interface IA {
    //常量(jdk7及以前)使用public static final关键字修饰,这三个关键都可以省略
    public static final int NUM1 = 100;
    int NUM2 = 10010;

    //抽象方法(jdk7及其前的)使用public abstract关键字修饰,这两个关键字也可以省略
    public abstract void method1();
    void method2();

    //默认方法(jdk8)使用public default关键字修饰,public可以省略,default不可以省略
    public default void metho3(){
        System.out.println("默认方法...method3");
    }

    //私有方法(jdk9及以后)使用private关键字修饰,private不可以省略
    //private static void method4(){
    //    System.out.println("私有方法..method4");
    //}
}
