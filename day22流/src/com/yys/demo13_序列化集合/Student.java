package com.yys.demo13_序列化集合;

import java.io.Serializable;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/15:54
 */
public class Student implements Serializable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
