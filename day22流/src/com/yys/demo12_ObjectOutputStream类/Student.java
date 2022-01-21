package com.yys.demo12_ObjectOutputStream类;

import java.io.Serializable;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/15:36
 */
public class Student implements Serializable {
    public String name;
    public transient int age;

    public Student() {
    }

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
