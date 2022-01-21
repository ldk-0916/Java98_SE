package com.yys.demo04_异常的概念;

import java.text.SimpleDateFormat;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/9:15
 */
public class Test {
    /*
        异常的概念: 程序在运行的过程中,出现了非正常情况,最终导致JVM的非正常停止
        注意:
            1.java等面向对象的编程语言中,异常本身就是一个类,产生异常就是创建异常对象,并抛出一个异常类
            2.java对异常进行中断处理

        异常的继承关系:
            java.lang.Throwable
                java.lang.Error:表示错误,程序员无法通过代码进行就纠正,类似于绝症,无法医治,只能提前避免
                    栈内存溢出,服务器宕机,数据库崩溃
                Java.lang.Exception:表示异常,可修复的,类似于感冒...

            异常的分类:
                编译时异常:代码编译的期间出现的异常,必须解决,否则无法通过编译,程序无法运行

                运行时时异常:在运行的时候出现的异常,就是可以通过编译,程序无法执行
     */
    public static void main(String[] args) {
        //System.out.println("张三")//编译时异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //sdf.parse("1990-01-01");编译时异常

        //运行时异常
        System.out.println(10 / 0);//java.lang.ArithmeticException算数异常,也叫除0异常
    }
}
