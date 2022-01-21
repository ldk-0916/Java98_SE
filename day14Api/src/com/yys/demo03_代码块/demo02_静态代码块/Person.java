package com.yys.demo03_代码块.demo02_静态代码块;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/11:05
 */
public class Person {
    static {
        System.out.println("Person 类的静态代码块...");
    }
    {
        System.out.println("Person 类的构造代码块...");
    }
    public Person(){
        System.out.println("Person类的构造方法...");
    }
}
