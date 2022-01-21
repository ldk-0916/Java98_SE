package com.yys.demo05_toString方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/11:25
 */
public class Person extends Object {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //{name = "张三";age = 14}
   /* @Override
    public String toString(){
        return "Person{"+"name=" + name+ ",age=" + age +"}";
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
