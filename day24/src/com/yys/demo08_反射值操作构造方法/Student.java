package com.yys.demo08_反射值操作构造方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/10:50
 */
public class Student {
    public String name;
    public int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student(String name){
        this.name = name;
    }
    public Student(int age){
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
