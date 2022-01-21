package com.yys09private关键字;

/**
 * private:1.权限修饰符,可以修饰成员变量和成员方法
 *         2.被修饰的成员变量/方法只能在本类中访问
 *
 *         private 类型 变量名
 */
public class Student {
    private String name;//姓名
    private int age; //年龄

    private void study(){
        System.out.println("正在学习java基础");
    }

    public void show(){
        System.out.println(name + ":" + age);
    }
}
