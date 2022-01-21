package com.yys.demo07this关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/15:14
 */
public class Person {
    String name;
    int age;

    public Person() {
        //调用有参
        //this("张三",18);
        System.out.println("无参构造方法");
    }

    public Person(String name, int age) {
        //调用无参构造
        this();
        System.out.println("有参构造方法...");
        this.name = name;
        this.age = age;
    }
    public void show(){
        //this();编译报错
    }
}
class Test2{
    /*
        this1访问本类构造方法:
            访问本类空参的构造方法: this();
            访问本类有参构造方法: this(有参)
                注意:
                    1.在构造方法中调用其他构造方法,必须放在构造方法的第一行
                    2.使用this访问本类的构造方法,只能再本类的构造方法中使用
                    3.本类构造方法不能同时相互调用
     */

    //创建对象
    Person p = new Person();

    //有参略...
}
