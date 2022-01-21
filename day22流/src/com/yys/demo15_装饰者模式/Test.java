package com.yys.demo15_装饰者模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/12/9:34
 */
public class Test {
    public static void main(String[] args) {
        /*
            装饰者模式:(了解)
                概述:在我们所学的缓冲流中涉及到java中的一种设计模式;
                装饰模式指的是在不改变原类, 不使用继承的基础上，动态地扩展一个对象的功能
                实现规则(步骤):
                    1. 装饰类和被装饰类必须实现相同的接口
                    2. 在装饰类中必须传入被装饰类的引用
                    3. 在装饰类中对需要扩展的方法进行扩展
                    4. 在装饰类中对不需要扩展的方法调用被装饰类中的同名方法
         */
        //创建对象
        LiuDeHua ldh = new LiuDeHua();
        //调用方法
        ldh.sing();
        ldh.dance();
        //增强对象
        Decorate dc = new Decorate(ldh);
        dc.sing();
        dc.dance();
    }
}
