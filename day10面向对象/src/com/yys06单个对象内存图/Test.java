package com.yys06单个对象内存图;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/29/13:40
 */
public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student stu1 = new Student();
        //访问成员变量
        stu1.name = "张三";
        stu1.age =  18;
        System.out.println(stu1.name + ":" + stu1.age);
        //访问成员方法
        stu1.study();
        stu1.doHomeWork();

        Student stu2 = new Student();
        stu2.name = "罗翔";
        System.out.println(stu2.name);
    }
}
