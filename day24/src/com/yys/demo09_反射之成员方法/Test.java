package com.yys.demo09_反射之成员方法;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/13:40
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            反射之操作成员方法:
                反射之操作成员方法的目的
                    * 操作Method对象来调用成员方法
                Method类概述
                    * 每一个成员方法都是一个Method类的对象。

                应用:
                    Class类中与Method相关的方法
                        * Method getMethod(String name,Class...args);
                            * 根据方法名和参数类型获得对应的构造方法对象，只能获得public的

                        * Method getDeclaredMethod(String name,Class...args);
                            * 根据方法名和参数类型获得对应的构造方法对象，包括public、protected、(默认)、private的

                        * Method[] getMethods();
                            * 获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的

                        * Method[] getDeclaredMethods();
                            * 获得类中的所有成员方法对象，返回数组,只获得本类的，包括public、protected、(默认)、private的

                      Method对象常用方法
                        *  Object invoke(Object obj, Object... args)
                            参数1:调用方法的对象
                            参数2：调用方法时传递的实际参数
                        *  void setAccessible(true)
                            设置"暴力访问"——是否取消权限检查，true取消权限检查，false表示不取消
         */
        //获取学生类的Class对象
        Class<Student> stu = Student.class;
        //获取show1方法
        Method m1 = stu.getMethod("show1");
        System.out.println(m1);

        //通过反射来获取show2方法
        Method m2 = stu.getDeclaredMethod("show2",int.class);
        System.out.println(m2);

        //通过反射获取show3方法
        Method m3 = stu.getDeclaredMethod("show3");
        System.out.println(m3);

        //通过反射获取show4方法
        Method m4 = stu.getDeclaredMethod("show4",String.class);

        //通过反射的方式来获取show5方法
        Method m5 = stu.getDeclaredMethod("show5", int.class);
        System.out.println(m5);

        System.out.println("---------------------------------------------------");
        //获取所有的方法
        //Method[] arr1 = stu.getMethods();//只能获得public修饰和父类成员方法
        Method[] arr1 = stu.getDeclaredMethods();
        for (Method m: arr1) {
            System.out.println(m);
        }
        System.out.println("-------------------------------分割线-------------------------------------------");

        //通过反射创建Student对象
        Student s = stu.newInstance();
        //通过反射来执行他的成员方法show1
        m1.invoke(s);
        //通过反射来执行他的成员方法show2
        m2.invoke(s,100);

        //设置暴力访问,取消m3表示的访问权限,访问show3
        m3.setAccessible(true);
        m3.invoke(s);

        //m4同理....

        //通过反射来执行他的成员方法,show5
        Object res = m5.invoke(s, 3);
        System.out.println(res);
    }
}
