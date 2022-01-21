package com.yys.demo18引用类型使用小结.demo05_抽象类作为成员变量;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/9:46
 */
public abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }
}

class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }
}

class People{
    String name;
    int age;
    Pet pet;

    public People(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }
}