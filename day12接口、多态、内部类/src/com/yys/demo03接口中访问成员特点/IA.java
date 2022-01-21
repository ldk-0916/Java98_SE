package com.yys.demo03接口中访问成员特点;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/10:45
 */
public interface IA {
    //常量
    public static final int NUM = 10;

    //抽象方法
    public abstract void method1();

    //默认方法
    public default void method2(){
        //method1();
        //method3();
        //method4();
        //method5();
        System.out.println("接口中默认方法...method2");
    }

    //静态方法
    public static void method3(){
        //method5();//只能调用静态方法
        System.out.println("接口中的静态方法...method3");
    }

    //私有方法
   /* private void method4(){
        System.out.println("接口中的私有方法...method4");
    }*/

    //静态私有方法
    /*private static void method5(){
        System.out.println("接口中的静态私有方法");
    }*/
}
