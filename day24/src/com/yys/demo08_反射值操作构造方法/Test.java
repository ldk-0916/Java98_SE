package com.yys.demo08_反射值操作构造方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/10:50
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
            反射之操作构造方法的目的
                获得Constructor对象来创建类的对象。
            Constructor类概述
                类中的每一个构造方法都是一个Constructor类的对象

             使用:
                1.如何通过反射获取一个类中的构造方法:Class类的方法
                     1. Constructor getConstructor(Class... parameterTypes)
                        * 根据参数类型获得对应的Constructor对象。
                        * 只能获得public修饰的构造方法
                     2. Constructor getDeclaredConstructor(Class... parameterTypes)
                            * 根据参数类型获得对应的Constructor对象
                            * 可以是public、protected、(默认)、private修饰符的构造方法。

                     3. Constructor[] getConstructors()
                            获得类中的所有构造方法对象，只能获得public的
                     4. Constructor[] getDeclaredConstructors()
                            获得类中的所有构造方法对象
                            可以是public、protected、(默认)、private修饰符的构造方法。

                2.如何通过反射执行获取的构造方法:Constructor的方法
                    1. T newInstance(Object... initargs)
                        根据指定的参数创建对象
                    2. void setAccessible(true)
                       设置"暴力反射"——是否取消权限检查，true取消权限检查，false表示不取消
         */
        //获取Student类的Class类对象
        Class<Student> c1 = Student.class;

        //获取单个的构造方法,无参...
       // Constructor<Student> constructor = c1.getConstructor();//NoSuchMethodException(运行时异常)
        /*String name = constructor.getName();
        System.out.println(name);*/
        Constructor<Student> ct1 = c1.getDeclaredConstructor();
        String name = ct1.getName();
        //System.out.println(name);

        //获取全参构造方法
        Constructor<Student> ct2 = c1.getDeclaredConstructor(String.class, int.class);

        //获取私有的
        Constructor<Student> ct3 = c1.getDeclaredConstructor(String.class);

        //获取所有的构造方法
        Constructor<?>[] arr = c1.getDeclaredConstructors();
        for (Constructor<?> con: arr) {
            System.out.println(con);
        }

        System.out.println("-----------------------分隔线------------------------------");

        //通过ct1表示的构造方法来创建Student对像
        Student stu1 = ct1.newInstance();
        System.out.println(stu1);

        //通过ct2表示的构造方法来创建Student对象
        Student stu2 = ct2.newInstance("罗翔", 44);
        System.out.println(stu2);
        //取消ct3表示的构造方法的权限查看
        ct3.setAccessible(true);

        //通过ct3表示的构造方法来创建对象
        Student stu3 = ct3.newInstance("张三");
        System.out.println(stu3);
    }
}
