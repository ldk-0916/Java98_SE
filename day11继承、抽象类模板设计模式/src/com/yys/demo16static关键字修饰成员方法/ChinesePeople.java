package com.yys.demo16static关键字修饰成员方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/14:53
 */
public class ChinesePeople {
    //非静态成员变量
    String name;//姓名
    //静态成员变量
    static String country;//国籍

    //非静态方法
    public void method1(){
        System.out.println("非静态 method1方法");
    }

    public void method2(){
        //非静态方法可以直接访问一切成员变量和成员方法
        System.out.println(name);
        System.out.println(country);
        method1();
        method4();
    }

    //静态方法
    public static void method3(){
        //静态方法不能直接访问非静态成员变量和成员方法
        //System.out.println("非静态成员变量"+name);//编译报错
        //method1();

        //静态方法中只能直接访问静态成员变量和静态成员方法
        method4();
        System.out.println("静态成员变量"+country);

        //静态方法中不可以出现this关键字
        //System.out.println(this.name);//编译报错
        //System.out.println(this.country);//编译报错
        System.out.println("静态 method3方法");
    }
    public static void method4(){
        System.out.println("静态 method4方法");
    }
}
