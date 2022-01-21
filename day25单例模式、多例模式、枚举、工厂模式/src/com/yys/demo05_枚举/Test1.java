package com.yys.demo05_枚举;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/10:36
 */
public class Test1 {
    public static void main(String[] args) {

        /*
            性别这个字符串,在实际中只有男和女,在这里可以给他任意字符串,不符合实际情况,导致性别是非法数据,不安全
         */
        Person p1 = new Person("张三",Sex.BOY);
        Person p2 = new Person("李三",Sex.YAO);
        Person p3 = new Person("李三",Sex.GIRL);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        Sex.BOY.show();
    }
}
