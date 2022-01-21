package com.yys.demo11多态的应用场景.demo02_形参多态;

import java.lang.reflect.Method;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/10:41
 */
public class Animal {
    public void eat(){
        System.out.println("吃东西...");
    }
}
class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("狗啃骨头..");
    }
}

class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("猫吃鱼..");
    }
}



