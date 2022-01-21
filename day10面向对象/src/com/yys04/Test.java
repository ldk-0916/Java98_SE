package com.yys04;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/29/13:40
 */
public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student stu = new Student();
        //访问成员变量
        stu.name = "张三";
        stu.age =  18;
        System.out.println(stu.name + ":" + stu.age);
        //访问成员方法
        stu.study();
        stu.doHomeWork();
    }
}
