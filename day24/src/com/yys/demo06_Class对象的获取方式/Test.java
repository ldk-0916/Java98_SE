package com.yys.demo06_Class对象的获取方式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/10:34
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            Class对象的获取方式:
                1.通过类名.class获取
                2.通过对象名.getClass()方法获取
                3.通过Class类的静态方法获取
                每一个类的Class对象只有一个
         */
        //通过类名.class获取
        Class<Student> c1 = Student.class;

        //通过对象名.getClass()方法获取
        Student stu = new Student();
        Class<? extends Student> c2 = stu.getClass();

        //3.通过Class类的静态方法获取
        Class<?> c3 = Class.forName("com.yys.demo06_Class对象的获取方式.Student");

        System.out.println(c1 == c2);//true
        System.out.println(c3 == c2);//true
    }
}
