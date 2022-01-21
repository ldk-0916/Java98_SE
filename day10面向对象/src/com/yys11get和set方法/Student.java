package com.yys11get和set方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/30/9:25
 */
public class Student {
    private String name;
    private int age;

    //提供给成员变量赋值的方法-set方法
    public void setName(String s){
        name = s;//把s赋值给name
    }

    public void setAge(int num){
        if (num < 0 || num > 100){
            System.out.println("不合理...");
        }else{
            age = num;
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


