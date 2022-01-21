package com.yys.demo10_反射操作成员方法案例;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/14:10
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            Method()类:
                getName():获取方法名
         */
        //获取Student的Class对象
        Class<Student> stu = Student.class;

        //获取构造方法
        Constructor<Student> dct = stu.getDeclaredConstructor();

        //获取所有的构造方法
        Constructor<?>[] dcts = stu.getDeclaredConstructors();
        for (Constructor<?> c : dcts) {
            System.out.println(c);
        }
        //获取所有的成员方法
        Method[] dm = stu.getDeclaredMethods();
        for (Method m: dm) {
            if (m.getName().equals("show1")){
                m.invoke(stu);
            }else if (m.getName().equals("show2")){
                m.invoke(stu,1);
            }else{
                //略...
            }
        }
    }
}
