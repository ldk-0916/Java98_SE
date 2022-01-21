package com.yys.demo11_反射之操作成员变量;

import java.lang.reflect.Field;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/14:22
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            反射之操作成员变量的目的
                * 通过Field对象给对应的成员变量赋值和取值
            Field类概述
                * 每一个成员变量都是一个Field类的对象。

            应用:
                如何通过反射获取类的成员变量:Class类的方法
                Class类中与Field相关的方法
                    * Field getField(String name);
                        *  根据成员变量名获得对应Field对象，只能获得public修饰
                    * Field getDeclaredField(String name);
                        *  根据成员变量名获得对应Field对象，包括public、protected、(默认)、private的
                    * Field[] getFields();
                        * 获得所有的成员变量对应的Field对象，只能获得public的
                    * Field[] getDeclaredFields();
                        * 获得所有的成员变量对应的Field对象，包括public、protected、(默认)、private的

                  如何通过反射访问获取类的成员变量:Field方法:
                    Field对象常用方法
                        void  set(Object obj, Object value)
                        void setInt(Object obj, int i)
                        void setLong(Object obj, long l)
                        void setBoolean(Object obj, boolean z)
                        void setDouble(Object obj, double d)

                        Object get(Object obj)
                        int	getInt(Object obj)
                        long getLong(Object obj)
                        boolean getBoolean(Object ob)
                        double getDouble(Object obj)

                        void setAccessible(true);暴力反射，设置为可以直接访问私有类型的属性。
                        Class getType(); 获取属性的类型，返回Class对象。
         */
        //获取Person1类的Class对象
        Class<Person> pc = Person.class;
        //构造方法
        Person p = pc.newInstance();
        //通过反射获取成员变量
        Field f1 = pc.getDeclaredField("name");
        System.out.println(f1);
        //同理年龄
        Field f2 = pc.getDeclaredField("age");
        System.out.println(f2);

        //获取所有成员变量
        Field[] df = pc.getDeclaredFields();
        for (Field f: df) {
            System.out.println(f);
        }

        System.out.println("-----------------------------------------------------------------");

        //获取类型
        System.out.println(f1.getType());//class java.lang.String

        //通过反射给变量赋值
        f1.set(p,"张三");
        //获取属性
        System.out.println(f1.get(p));
        //暴力反射
        f2.setAccessible(true);
        f2.set(p,18);
        //获取属性
        System.out.println(f2.get(p));
    }
}
