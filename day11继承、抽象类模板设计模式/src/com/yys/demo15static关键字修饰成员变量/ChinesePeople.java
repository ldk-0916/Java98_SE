package com.yys.demo15static关键字修饰成员变量;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/14:53
 */
public class ChinesePeople {
    //非静态成员变量
    String name;//姓名
    //静态成员变量
    static String country;//国籍

    public ChinesePeople() {
    }

    public ChinesePeople(String name,String country) {
        this.name = name;
        this.country = country;
    }
}
