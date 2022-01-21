package com.yys.demo03继承的关系;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/11:20
 */
public class Person {
    //成员变量
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat(){
        System.out.println("吃东西...");
    }

    public void drink(){
        System.out.println("喝东西...");
    }

    public void sleep(){
        System.out.println("睡觉...");
    }
}
