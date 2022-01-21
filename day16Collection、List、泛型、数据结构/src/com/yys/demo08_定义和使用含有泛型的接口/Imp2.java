package com.yys.demo08_定义和使用含有泛型的接口;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/14:14
 */
public class Imp2<E> implements A<E> {
    @Override
    public void method1(E e) {
        System.out.println("Imp2抽象方法...");
    }

    @Override
    public E method2(E e) {
        return e;
    }
}
