package com.yys.demo08多态的概述;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/9:17
 */
public class Test {
    public static void main(String[] args) {
        /*
            多态:同一行为,不同的事务具有不同的表现形态
            实现多态:
                1.继承或者实现
                2.父类引用指向子类对象\接口引用指向实现类对象
                3.方法的重写

                父类类型 变量名 = new 子类对象；
                变量名.方法名();
         */
        //父类引用指向子类对象
        Animal anl = new Dog();//多态
        anl.eat();//狗啃骨头...

        Animal anl1 = new Cat();
        anl1.eat();//猫吃鱼...
    }
}
