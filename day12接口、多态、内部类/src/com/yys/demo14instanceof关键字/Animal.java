package com.yys.demo14instanceof关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/14:02
 */
public class Animal {
    public void eat(){
        System.out.println("吃东西");
    }
}
class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("狗啃骨头...");
    }
}
class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("猫吃鱼...");
    }
}
