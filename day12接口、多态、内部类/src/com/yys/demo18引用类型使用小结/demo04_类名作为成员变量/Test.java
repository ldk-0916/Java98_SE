package com.yys.demo18引用类型使用小结.demo04_类名作为成员变量;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/9:39
 */
public class Test {
    public static void main(String[] args) {
        //创建IDCard对象
        IDCard idCard = new IDCard("123456789987654321","中国");
        //创建Person对象
        Person p = new Person("张三",18,idCard);
        System.out.println(p.name+":"+p.age+" 身份证号:"+p.idCard.idNum+" 地址:"+p.idCard.address);
    }
}
