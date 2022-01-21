package com.yys.demo13模板设计模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/10:51
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println(name + ":" + age);
    }
    //没有抽象方法
}

class Dog extends Animal{
    public Dog(){
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}

abstract class Person{
    //抽象方法
    public abstract void eat();
    public abstract void drink();
}

//普通类继承抽象类,就必须重写抽象方法
class Student extends Person{

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }
}

//抽象子类继承抽象类后,可以不用重写他的抽象方法
abstract class Teacher extends Person{
    @Override
    public void eat(){
        //...
    }
}
