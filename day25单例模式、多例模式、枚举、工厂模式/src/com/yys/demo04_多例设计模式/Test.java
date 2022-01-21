package com.yys.demo04_多例设计模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/9:40
 */
public class Test {
    public static void main(String[] args) {
        /*
            多例模式:
                是一种常用的软件设计模式。通过多例模式可以保证系统中，应用该模式的类有固定数量的实例。
                多例类要自我创建并管理自己的实例，还要向外界提供获取本类实例的方法。

            实现步骤:
                1.创建一个类,  将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
            ​	2.在该类内部产生固定数量的实例化对象 ----> 集合
            ​   3.提供一个静态方法来随机获取一个该类的实例化对象
         */
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
        System.out.println(Student.getInstance());
    }
}
