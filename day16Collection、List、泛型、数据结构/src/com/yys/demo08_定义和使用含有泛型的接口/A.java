package com.yys.demo08_定义和使用含有泛型的接口;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/14:04
 */
public interface A<E> {
    public abstract void method1(E e);
    public default E method2(E e){
        return e;
    }
}
