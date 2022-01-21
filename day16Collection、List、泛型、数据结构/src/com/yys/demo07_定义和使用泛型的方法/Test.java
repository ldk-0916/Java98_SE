package com.yys.demo07_定义和使用泛型的方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/13:52
 */
public class Test {
    public static void main(String[] args) {
        /*
            定义和使用泛型的方法:
                修饰符 <泛型变量> 返回值类型 方法名(参数列表){
                    方法体
                }
                泛型变量:任意字母, 一般会用T,M...
                含有返回值类型的方法:调用含有泛型的方发时,再去确定的他的具体类型

                什么时候定义含有泛型的方法:
                    在一个类中,如果某一个方法的参数类型或者返回值类型不确定的时候,可以把该方法定义成含有泛型的方法
         */
        Integer m1 = method(100);
        System.out.println(m1);
        String m2 = method("罗翔");
        System.out.println(m2);
    }

    public static <T> T method(T t){
        return t;
    }
}
