package com.yys.demo15解决多态弊端;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/14:13
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
    public void JiDu(){
        System.out.println("狗狗正在缉毒...");
    }
}


