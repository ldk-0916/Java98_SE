package com.yys.demo02匿名对象;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/10:41
 *
 * 制作标准类
 */
public class Student {
    //成员变量
    private String name;//姓名
    private int age;//年龄

    //构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get和set方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //成员方法
    public void show(){
        System.out.println(name+":"+age);
    }
}
