package com.yys.demo17_内部类.demo03_接口匿名内部类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/16:24
 */
public class Test {
    public static void main(String[] args) {
        /*
            匿名内部类:
                概述:本质上就是一个接口的匿名实现类的对象
                new 接口名(){
                    实现抽象方法
                };
         */
        //需求:调用A接口的show方法
        /*
            1.创建实现类实现A接口
            2.在接口中重写show方法
            3.创建实现类对象
            4.使用实现类对象调用
         */
        Imp imp = new Imp();
        imp.show();

        System.out.println("--------------------------------");
        //简化:匿名内部类
        //第一种
        A a = new A() {
            @Override
            public void show() {
                System.out.println("匿名内部类对象");
            }
        };
        a.show();

        //匿名子类的匿名对象
        //第二种
        new Imp().show();//实现类的匿名对象调用show方法;

        //第三种
        new A(){

            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();//匿名是实现类的匿名对象调用show方法

        //第四种
        method(new A() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        });
    }

    public static void method(A a){

    }
}
