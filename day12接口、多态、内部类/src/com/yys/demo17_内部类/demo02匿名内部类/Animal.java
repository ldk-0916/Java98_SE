package com.yys.demo17_内部类.demo02匿名内部类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/15:44
 */
public abstract class Animal {
    public abstract void eat();
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗啃骨头..");
    }
}
