package com.yys.demo12_JDK提供的三个基本注解;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:04
 */
public class Fu {
    public void show(){

    }
}
class Zi extends Fu{
    @Override
    public void show(){
        System.out.println("我是子类重写方法..");
    }
}
