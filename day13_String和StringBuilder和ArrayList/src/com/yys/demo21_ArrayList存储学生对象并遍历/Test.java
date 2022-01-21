package com.yys.demo21_ArrayList存储学生对象并遍历;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/9:22
 */
public class Test {
    public static void main(String[] args) {
    //    创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",28);
        Student stu3 = new Student("罗翔",38);

        //把三个学生对象存到list集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //遍历获取元素
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+":"+stu.getAge());
        }
    }
}
