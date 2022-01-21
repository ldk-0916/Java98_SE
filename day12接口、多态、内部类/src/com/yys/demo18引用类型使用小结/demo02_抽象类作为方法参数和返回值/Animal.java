package com.yys.demo18引用类型使用小结.demo02_抽象类作为方法参数和返回值;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/9:13
 */
public abstract class Animal {
    //类中public可以省略,abstract不可以省略;接口中两个都可以省略
    public abstract void eat();
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗啃骨头...");
    }
}