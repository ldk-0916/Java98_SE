package com.yys.demo13模板设计模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/11:22
 */
public abstract class Driver {
    //开车方法,通用模板
    public void driverCar(){
        System.out.println("开门");
        System.out.println("点火");
        //姿势
        zishi();
        System.out.println("刹车");
        System.out.println("熄火");
    }
    //姿势方法,填充模板
    public abstract void zishi();
}
