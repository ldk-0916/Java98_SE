package com.yys.demo18引用类型使用小结.demo01_类名作为方法参数和返回值;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/16:43
 */
public class Person {
    public String name;
    public int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println(name+":"+age);
    }
}
