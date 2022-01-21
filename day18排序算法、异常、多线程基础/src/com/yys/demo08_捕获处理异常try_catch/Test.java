package com.yys.demo08_捕获处理异常try_catch;

import java.text.ParseException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/11:04
 */
public class Test {
    public static void main(String[] args) {
        /*
            捕获处理异常
                概念:对异常进行捕获,处理完后,程序可以继续向下执行

                格式:try{
                    编写可能会出现异常的代码

                }catch(异常的类型 变量名){
                    //处理异常的代码
                    //打印异常信息//记录日志
                }
                执行顺序
                    1.执行首先执行try中代码,如果try代码块出现了异常,就直接执行catch里面的代码执行完后,程序继续往下执行
                    2.如果try中没有出现异常,就不会执行catch里面的代码,而是程序继续向下执行
        */
        try {
            System.out.println(1 / 1);
        }catch (ArithmeticException e){
            System.out.println("出现了算数异常...");
        }

        //捕获运行时异常
        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException e){
            System.out.println("出现了算数异常");
        }

        method();
    }
    //捕获编译时异常
    public static void method(){
        try {
            throw new ParseException("解析异常",1);
        }catch (ParseException e){
            System.out.println("出现了解析异常");
        }
    }
}
