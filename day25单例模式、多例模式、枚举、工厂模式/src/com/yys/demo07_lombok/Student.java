package com.yys.demo07_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/13:32
 */
@Data//相当于getter和setter,toString,hashcode,equals
@NoArgsConstructor//无参构造
@AllArgsConstructor//有参构造
public class Student {
    private String name;
    private int age;
/*
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
}
