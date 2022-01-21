package com.yys.demo07_lombok;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/13:49
 */
public class Test {
    public static void main(String[] args) {
        Student stus = new Student();//通过无参构造
        Student stu = new Student("张三",18);//通过有参创建对象
        stus.setName("李四");
        stus.setAge(10);
        System.out.println(stus.getName()+":"+stus.getAge());
    }
}
