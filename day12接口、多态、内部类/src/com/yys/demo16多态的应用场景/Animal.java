package com.yys.demo16多态的应用场景;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/14:24
 */
public class Animal {

    public void eat(){
        System.out.println("吃东西...");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗啃骨头..");
    }

    public void sleep(){
        System.out.println("狗狗睡觉...");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼..");
    }

    public void catchMOuse(){
        System.out.println("猫捉老鼠...");
    }
}

