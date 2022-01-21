package com.yys.demo04_HashSet存储自定义类型元素;

import java.util.HashSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/11:05
 */
public class Test {
    public static void main(String[] args) {
        /*
            HashSet存储自定义类型元素:要重写HashCode和equals方法
            在开发当中,往往认为2个对象的所有属性值相同,就是两个相同的对象
         */
        //创建HashSet集合,...类型为Student
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("张三",18));
        Student stu1 = new Student("李四",22);
        Student stu2 = new Student("罗翔",45);
        set.add(stu1);
        set.add(stu2);
        set.add(new Student("张伟",32));
        System.out.println(stu1.hashCode());//26104874
        System.out.println(stu2.hashCode());//32343089
        //
        for (Student stu : set) {
            System.out.println(stu);
        }
    }
}
