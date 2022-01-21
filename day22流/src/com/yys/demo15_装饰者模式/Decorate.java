package com.yys.demo15_装饰者模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/12/9:42
 *
 * 1. 装饰类和被装饰类必须实现相同的接口
 * 2. 在装饰类中必须传入被装饰类的引用
 * 3. 在装饰类中对需要扩展的方法进行扩展
 * 4. 在装饰类中对不需要扩展的方法调用被装饰类中的同名方法
 */
public class Decorate implements Start {
    LiuDeHua ldh;

    public Decorate(LiuDeHua ldh) {
        this.ldh = ldh;
    }

    @Override
    public void sing() {
        //扩展/增强
        ldh.sing();
        System.out.println("刘德华在鸟巢的舞台上唱冰雨...");
    }

    @Override
    public void dance() {
        ldh.dance();
    }
}
