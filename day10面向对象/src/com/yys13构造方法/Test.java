package com.yys13构造方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/30/9:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            构造方法:构造方法是一种特殊的方法,主要是完成对象的创建和对象数据的初始化

             格式:
                权限修饰符 类名(){方法体}:无参构造

                权限修饰符 类名(参数){方法体}有参构造
            特点:
                1.构造方法没有返回值类型,连void都不用写
                2.构造方法的名字就是类名
                3.直接new来调用

            注意:
                1.如果没有创建构造方法,我们默认创建对象是用的无参构造
                2.如果定义了构造方法,系统将不再提供默认构造方法
         */
        Student stu = new Student();
        stu.setName("罗翔",35);
        System.out.println(stu.getName()+":"+stu.getAge());

        System.out.println("--------------------------------");
        Student stu1 = new Student("张三",18);//利用有参构造创建对象并初始化数据
    }
}
