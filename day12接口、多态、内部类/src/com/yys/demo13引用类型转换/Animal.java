package com.yys.demo13引用类型转换;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/13:37
 */
public class Animal {
    public void eat(){
        System.out.println("吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗啃骨头...");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼...");
    }
}
class person{

}
