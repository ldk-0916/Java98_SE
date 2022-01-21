package com.yys.demo09_HashMap存储自定义类型;

import java.util.Objects;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/11:04
 */
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        //计算哈希值
        return Objects.hash(name, age);
    }
}
