package com.yys.demo03_代码块.demo01_构造代码块;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/10:56
 */
public class Person {
    {
        System.out.println("Person类的代码块");
    }
    public Person(){
        System.out.println("Person 的无(空)参构造");
    }
    public void method(){
        System.out.println("method的方法");
    }
}
