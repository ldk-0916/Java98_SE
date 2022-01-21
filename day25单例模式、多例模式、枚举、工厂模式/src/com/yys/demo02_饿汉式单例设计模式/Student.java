package com.yys.demo02_饿汉式单例设计模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/9:13
 */
public class Student {

    //1.将构造方法私有化,无法通过new获取对象
    private Student() {
    }

    //2.在该类内部里面产生一个唯一的实例化对象
    private static final Student STU = new Student();

    //3.定义一个静态方法,返回这个唯一的实例化对象
    public static Student getInstance(){
        return STU;
    }
}
