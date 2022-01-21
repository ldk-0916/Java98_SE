package com.yys.demo07抽象类和接口的练习;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/16:10
 */
public class JiDuDog extends Dog implements JiDu {
    @Override
    public void bark() {
        System.out.println("缉毒犬找到了毒品,开始汪汪汪的尖叫...");
    }

    @Override
    public void eat() {
        System.out.println("缉毒犬吃东西...");
    }

    @Override
    public void JiDu() {
        System.out.println("吃完东西后,开始缉毒...");
    }
}
