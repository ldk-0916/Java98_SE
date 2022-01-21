package com.yys.demo17_内部类.demo02匿名内部类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/15:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            匿名内部类:
                概述:本质上就是一个类的匿名子类对象
                作用:就是用来简化代码,没有其他功能
                格式:
                    new 类名(){
                        实现抽象方法
                    };
         */
        //调用动物类的eat方法
        /*
            1.创建子类继承对象
            2.子类重写eat方法
            3.创建子类对象
            4.使用子类对象调用eat方法
         */
        Dog d = new Dog();
        d.eat();
        //以上四个步骤一个不能少,麻烦,可不可以简化代码?
        //使用匿名内部类
        System.out.println("============================");
        //创建子类对象==>创建Animal匿名内部类
        //父类引用指向子类对象
        Animal anl = new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        };//是Animal类的子类的对象
        anl.eat();

        method(new Animal() {
            @Override
            public void eat() {

            }
        });
    }

    Animal s = new Dog();
    public static void method(Animal anl){

    }
}
