package com.yys.demo11多态的应用场景.demo01_变量多态;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/10:36
 */
public class Animal {
    public void eat(){
        System.out.println("吃东西...");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗啃骨头..");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼..");
    }
}
class Test{
    public static void main(String[] args) {
        //变量多态:父类类型变量指向子类类型的对象
        Animal anl = new Dog();
        anl.eat();
    }
}
