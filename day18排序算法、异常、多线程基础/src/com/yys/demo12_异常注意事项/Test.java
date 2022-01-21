package com.yys.demo12_异常注意事项;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/15:08
 */
public class Test {
    public static void main(String[] args) {
        /*
            异常注意的事项:
                - 1.运行时异常被抛出可以不处理。即不捕获也不声明抛出。
                - 2.如果父类的方法抛出了多个异常,子类覆盖(重写)父类方法时,只能抛出相同的异常或者是常子集。
                - 3.父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
                - 4.声明处理多个异常,可以直接声明这多个异常的父类异常
                - 5.在try/catch后可以追加finally代码块，其中的代码一定会被执行，通常用于资源回收

                6.多个异常如何捕获和处理?
                    1.多个异常分别处理
                    2.多个异常一次捕获多次处理
                    3.多个异常一次捕获,一次处理
         */

        method4(3);
    }

    //运行时异常被抛出,我们可以不处理,即不补货,也不处理(声明抛出)
    public static void method1(){
        System.out.println(1/0);
    }

    //声明处理多个异常,可以直接声明这多个异常的父类异常
    public static void method2(int nums) throws Exception {
        if (nums == 1){
            throw new FileNotFoundException("李四");
        }else{
            throw new ParseException("",1);
        }
    }

    //多个异常分别处理
    public static void method3(int nums){
        if (nums == 1){
            try {
                throw new FileNotFoundException("");
            }catch (FileNotFoundException e){

            }
        }else{
            try {
                throw new ParseException("zs1",1);
            }catch (ParseException e){

            }
        }
    }

    //多个异常一次捕获,多次处理
    public static void method4(int nums){
        try {
            if (nums == 1){
                throw new FileNotFoundException("");
            }else{
                throw new IndexOutOfBoundsException();
            }
        }catch (FileNotFoundException e){
            System.out.println(e.toString());
        }catch (IndexOutOfBoundsException e){

        }
    }

    //多个异常一次捕获,一次处理
    public static void method5(int nums){
        try {
            if (nums == 1){
                throw new FileNotFoundException("");
            }else{
                throw new ParseException("",1);
            }
        }catch (Exception e){
            System.out.println("多次异常,一次处理");
        }
    }

    //当多异常分别处理时,捕获处理,前面的类不能是后面类的父类
    public static void method6(int nums){
        try {
            if (nums == 1){
                throw new FileNotFoundException("");
            }else{
                throw new ParseException("",1);
            }
        }catch (ParseException e){

        }catch (Exception e){

        }
    }

}
