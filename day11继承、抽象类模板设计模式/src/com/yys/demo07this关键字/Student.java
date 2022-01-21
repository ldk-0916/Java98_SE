package com.yys.demo07this关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/15:00
 */
public class Student {
    int age;
    String name;
    public void show(){
        System.out.println(name+":"+age);
    }

    public void method(String name){
        //this访问本类成员变量:用来区分同名的成员变量和局部变量 会用就行
        System.out.println("成员变量name的值:"+this.name);
        System.out.println("局部变量name的值:"+name);
    }
}

