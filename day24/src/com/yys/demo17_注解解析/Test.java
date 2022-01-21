package com.yys.demo17_注解解析;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:56
 */
@MyAnnotation(name = "张三",age = 18)
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            注解解析:
                java.lang.reflect.AnnotatedElement接口: Class、Method、Field、Constructor等实现了AnnotatedElement
                T getAnnotation(Class<T>annotationType):得到指定类型的注解引用。没有返回null。
                boolean isAnnotationPresent(Class<?extends Annotation> annotationType)：判断指定的注解有没有。
         */
        //获取Test的Class对象
        Class<Test> tc = Test.class;

        //获取注解对象
        MyAnnotation at = tc.getAnnotation(MyAnnotation.class);

        //根据注解对象获取他的属性值
        int age = at.age();
        System.out.println(age);

        System.out.println("-----------------------------------");

        //获取方法的注解对象
        Method show = tc.getDeclaredMethod("show");//获取show方法上的Method对象
        MyAnnotation mt = show.getAnnotation(MyAnnotation.class);
        System.out.println(Arrays.toString(mt.name()));
        System.out.println(mt.age());

        //判断有没有指定的注解 isAnnotationPresent
        Method m = tc.getDeclaredMethod("play");
        System.out.println(m.isAnnotationPresent(MyAnnotation.class));//false

    }
    @MyAnnotation(name = "张三丰",age = 180)
    public void show(){
        System.out.println("太极剑...");
    }

    public void play(){
        System.out.println("太极拳...");
    }
}
