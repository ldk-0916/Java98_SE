package com.yys.demo21_ArrayList存储学生对象并遍历;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/9:23
 */
public class Student {
    private String name;//姓名
    private int age;//年龄

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
