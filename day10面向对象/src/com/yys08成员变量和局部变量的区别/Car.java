package com.yys08成员变量和局部变量的区别;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/29/15:27
 */
public class Car {
    //成员变量
    String color;
    //成员方法
    public void driver(){
        int speed = 70;//局部变量
        System.out.println("汽车正在以"+speed+"迈的速度行驶...");
    }
}
