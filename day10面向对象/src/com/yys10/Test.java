package com.yys10;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/30/9:25
 */
public class Test {
    public static void main(String[] args) {
        /*
            为什么要封装属性:
                通过对象名点他的属性来访问成员变量来进行赋值,会存在安全隐患

                解决方式:
                    不让外界对象直接访问成员变量(把属性封装起来)
                  如何封装 步骤:
                    1.使用private关键字来修饰成员变量
                    2.提供公共的访问方法:
                       给成员变量赋值的公共方法(set方法)
                       获取成员变量值的公共方法(get方法)
         */
        Student stu = new Student();
        //通过对象名点他的属性来访问成员变量来进行赋值,会存在安全隐患
        stu.name = "张三";
        stu.age = 18;
    }
}
