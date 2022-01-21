package com.yys.demo17_内部类.demo01_成员内部类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/15:18
 */
public class Test {
    public static void main(String[] args) {
        /*
            什么是内部类:将一个类A定义在另一个类B里面，里面的那个类A就称为**内部类**，B则称为**外部类**。
                格式:
                class 外部类 {
                     class 内部类{
                                 }
                            }
             成员内部类访问特点:
               1.在外部类中,访问内部类成员,首先创建内部类对象;
                  01.内部类名 对象名 = new 内部类名
                  02.外部类名.内部类名 对象名 = new 外部类名.new 内部类名();
               2.在其他类中,访问内部类成员,首先创建内部类对象
                  外部类名.内部类名 对象名 = new 外部类名.new 内部类名();
               3.在内部类中,可以直接访问外部类的一切成员,包含私有的
         */
        //创建内部类对象
        Body.Heart bh = new Body().new Heart();
        System.out.println(bh.numN);//
        bh.methodN1();//

        System.out.println("========================");
        //创建外部类对象
        Body b = new Body();
        b.methodW1();
        System.out.println("===================================");
        bh.methodN2();
    }
}
