package com.yys.demo12多态的好处和弊端;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/11:09
 */
public class Animal {
    public void eat(){
        System.out.println("吃东西...");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗狗啃骨头...");
    }
    public void JiDu(){
        System.out.println("狗狗缉毒...");
    }
}
