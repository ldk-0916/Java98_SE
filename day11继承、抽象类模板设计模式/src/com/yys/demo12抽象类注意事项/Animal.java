package com.yys.demo12抽象类注意事项;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/9:47
 */
public abstract class Animal {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println(name + ":" + age);
    }
    //抽象方法
    public abstract void eat();
}
