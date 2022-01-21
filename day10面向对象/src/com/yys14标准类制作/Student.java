package com.yys14标准类制作;

/**
 `JavaBean` 是 Java语言编写类的一种标准规范。符合`JavaBean` 的类，
 要求类必须是公共的，属性使用private修饰,并且具有无参数的构造方法，
 提供用来操作成员变量的`set` 和`get` 方法。
 */
public class Student {
    //1.成员变量要用private修饰
    private String name;
    private int age;

    //2.无参构造方法
    public Student(){

    }

    //alt+insert快捷键生成get和set方法

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
