package com.yys.demo07_Class类常用方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/10:41
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        /*
            Class类常用方法
                String getSimpleName(); 获得类名字符串：类名
                String getName();  获得类全名：包名+类名
                T newInstance() ;  创建Class对象关联类的对象
         */
        //获取Student的Class类对象
        Class<Student> c1 = Student.class;

        //获取类名字符串
        String name1 = c1.getSimpleName();
        System.out.println(name1);//Student

        String name2 = c1.getName();
        System.out.println(name2);//com.yys.demo07_Class类常用方法.Student

        //
        Student stu = c1.newInstance();//调用了Student类的无参构造方法
        System.out.println(stu);//com.yys.demo07_Class类常用方法.Student@14ae5a5
        stu.name = "张三";

    }
}
