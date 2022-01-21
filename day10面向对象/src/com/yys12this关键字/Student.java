package com.yys12this关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/30/9:25
 */
public class Student {
    private String name;
    private int age;

    //提供给成员变量赋值的方法-set方法
    public void setName(String name){
       this.name = name;//把name赋值给成员变量this.name
    }

    public void setAge(int age){
        if (age < 0 || age > 100){
            System.out.println("不合理...");
        }else{
            this.age = age;
        }
    }

    //提供get方法来得到成员变量的值
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}


