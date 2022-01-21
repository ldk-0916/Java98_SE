package com.yys13构造方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/30/9:25
 */
public class Student {
    private String name;
    private int age;

    public Student(){
        //空/无参构造
        System.out.println("无参构造");
    }

    public Student(String name,int age){
        System.out.println("有参构造");
    }

    //提供给成员变量赋值的方法-set方法
    public void setName(String name,int age){
       this.name = name;//把name赋值给成员变量this.name
       this.age = age;
    }

    //提供get方法来得到成员变量的值
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}


