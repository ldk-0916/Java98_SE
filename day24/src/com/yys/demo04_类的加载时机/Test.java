package com.yys.demo04_类的加载时机;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/9:47
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //创建类的实例
        new Student();

        //访问类的静态变量或者为静态变量赋值
        System.out.println(Student.country);

        //类的静态方法
        Student.method();

        //使用反射方式来强制创建某个类或接口对应的java.lang.Class对象
        Class<?> c = Class.forName("com.yys.demo04_类的加载时机.Student");

        //初始化某个子类
        new Son();

        //直接使用java.exe命令来运行某个主类。
    }
}
