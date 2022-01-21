package com.yys.demo01_Collections类;


/**
 * @Author: 夜遊神
 * @Date: 2021/10/22/15:20
 */
public class Student implements Comparable<Student> {
    int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student stu){
        return this.age - stu.age;
    }
}
