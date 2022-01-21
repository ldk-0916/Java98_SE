package com.yys.demo18引用类型使用小结.demo04_类名作为成员变量;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/9:35
 */
public class Person {
    String name;//姓名 引用类型定义
    int age;//年龄 基本类型定义
    IDCard idCard;//类名作为成员变量 引用类型

    public Person(String name, int age, IDCard idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }
}
class IDCard{
    String idNum;//身份证号
    String address;//地址

    public IDCard(String idNum, String address) {
        this.idNum = idNum;
        this.address = address;
    }
}
