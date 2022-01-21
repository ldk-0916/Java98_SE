package com.yys.demo18引用类型使用小结.demo05_抽象类作为成员变量;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/9:49
 */
public class Test {
    public static void main(String[] args) {
        //抽象类作为成员变量:传入的是子类对象
        Pet pet = new Dog("哈林");

        //创建People对象
        People p = new People("张三",2,pet);
        System.out.println(p.name+":"+p.age+" 宠物名:"+p.pet.name);
    }
}
