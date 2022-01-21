package com.yys.demo06_定义和使用含有泛型的类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/13:35
 */
public class MyArrayList<E> {
    //属性(成员变量)
    //String age;
    E e;
    public E method1(E e){
        return e;
    }
    public E metho2(E e){
        return e;
    }

    public <T> T metho3(E e){
        return (T) e;
    }
}
