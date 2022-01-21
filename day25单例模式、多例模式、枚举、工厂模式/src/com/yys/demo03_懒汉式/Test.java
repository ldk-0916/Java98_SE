package com.yys.demo03_懒汉式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/9:25
 */
public class Test {
    public static void main(String[] args) {
        /*
            懒汉式:
                就是调用getInstance方法实例才被创建,不着急实例化对象,等要用到时候才实例化对象

            注意：
                懒汉单例设计模式在多线程环境下可能会实例化出多个对象，不能保证单例的状态，
                所以加上关键字：synchronized，保证其同步安全。
         */
        //获取Student类对象
        Student stu1 = Student.getInstance();
        Student stu2 = Student.getInstance();
        Student stu3 = Student.getInstance();
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
    }
}
