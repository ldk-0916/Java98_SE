package com.yys.demo03_懒汉式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/9:25
 */
public class Student {

    //私有化构造方法
    private Student() {
    }

    //定义一个Student类型的变量,不给他实例化(初始化)
    private static Student stu;

    public static synchronized Student getInstance(){
        //如果是第一次调用,就创建该对象
        if (stu == null){
            stu = new Student();
        }
        //如果不是第一次调用,就直接给他返回
        return stu;
    }
}
