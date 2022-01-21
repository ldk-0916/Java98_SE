package com.yys.demo14final关键字的概述和使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/14:08
 */
public class Test3 {
    public static void main(String[] args) {
        /*
            引用类型的局部变量被final修饰后,只能指向一个地地址,不能修改,但是不影响内部成员变量值的修改
         */
        final Student stu = new Student("张三",18);
        //stu = new Student("王五",19);编译报错:
        stu.setAge(19);
        System.out.println(stu.getName()+":"+stu.getAge());
    }
}
