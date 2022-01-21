package com.yys.demo12抽象类注意事项;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/10:26
 * 子类继承抽象类后必须重写所有的抽象方法,否则子类必须需也是抽象类
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }
}
