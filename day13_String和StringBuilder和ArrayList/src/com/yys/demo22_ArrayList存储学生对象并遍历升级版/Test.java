package com.yys.demo22_ArrayList存储学生对象并遍历升级版;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/9:30
 */
public class Test {
    public static void main(String[] args) {
        /*
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制 台遍历该集合 ( 学生的姓名和年龄来自于键盘录入)
         */
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //添加学生
        method1(list,sc);
        method1(list,sc);
        method1(list,sc);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+":"+stu.getAge());
        }


    }

    public static void method1(ArrayList<Student> list,Scanner sc){
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        //创建学生对象
        Student stu = new Student(name,age);
        //往集合中添加元素
        list.add(stu);

    }
}
