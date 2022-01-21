package com.yys.demo05方法重写;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/14:10
 */
public class Fu {
    public void method(){
        System.out.println("Fu method");
    }
}
class Zi extends Fu{
    @Override//注解
    public void method(){
        System.out.println("Zi method");
    }
    public void show(){
        System.out.println("Zi show");
    }
}
