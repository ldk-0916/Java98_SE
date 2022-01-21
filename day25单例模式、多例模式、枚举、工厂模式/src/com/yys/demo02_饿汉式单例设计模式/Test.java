package com.yys.demo02_饿汉式单例设计模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/9:15
 */
public class Test {
    public static void main(String[] args) {
        /*
            饿汉式:实用类的时候已经创建完对象了,不管以后你会不会用到,先创建了再说,特别着急的样子
         */
        //无法通过new直接获取对象
        //Student stu = new Student();
        Student stu = Student.getInstance();
        System.out.println(stu);
        System.out.println(Student.getInstance());
    }
}
