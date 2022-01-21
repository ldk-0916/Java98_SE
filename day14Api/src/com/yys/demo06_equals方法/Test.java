package com.yys.demo06_equals方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/13:57
 */
public class Test {
    public static void main(String[] args) {
        /*
            Object类的equals方法:
                public boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。
                源码:public boolean equals(Object obj) {
                            return (this == obj);
                        }
                特点:1.Object类的equals方法默认比较的是两个对象的地址值是否相等(==比较)
                     2.java中所有的类都继承了Object类,所以如果类中没有重写equals,默认比较的就是地址值
                     3.如果想要比较内容,即所有属性或者指定的属性(成员变量)相同就判定为两个对象相同,则重写equals方法就行
         */
        //创建Object对象
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);//false:比较的是地址值
        System.out.println((obj1).equals(obj2));//false

        System.out.println("=============================");

        Person p1 = new Person("张三",18);
        Person p2 = new Person("张三",18);
        //开发中经常习惯的认为p1和p2是相同的对象,因为属性相同
        System.out.println(p1);//com.yys.demo06_equals方法.Person@14ae5a5
        System.out.println(p2);//com.yys.demo06_equals方法.Person@7f31245a
        //因为Person类没有重写equals方法
        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//false

        System.out.println("====================================================");

        //Person类重写了equals方法;比较p1和p2
        System.out.println(p1 == p2);//false比较的是地址值
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));//true

        System.out.println("------------------------------------");
        Person p3 = new Person(null,18) ;
        System.out.println(p1.equals(p3));
    }
}
