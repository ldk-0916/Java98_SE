package com.yys02类的组成;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/29/9:59
 */
public class Person {
    //属性(成员变量):放在类里的..
    String name;
    int age;
    String gender;

    //行为(成员方法)
    public void eat(){
        String score;//局部变量(放在方法里的...)
        System.out.println("吃饭....");
    }
    public void sleep(){
        System.out.println("睡觉....");
    }
}
