package com.yys.demo05_枚举;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/10:44
 */
//性别枚举
public enum Sex {
    BOY(18),GIRL(19),YAO(1);
    private int age;

    //构造方法
    private Sex(int age) {
        this.age = age;
    }

    //成员方法
    public void show(){
        System.out.println("年龄:"+age);
    }
}
