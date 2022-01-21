package com.yys.demo08_定义和使用含有泛型的接口;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/14:06
 */
public class Imp implements A<String> {
    @Override
    public void method1(String s) {
        System.out.println("抽象方法...");
    }

    @Override
    public String method2(String str) {
        return null;
    }
}
