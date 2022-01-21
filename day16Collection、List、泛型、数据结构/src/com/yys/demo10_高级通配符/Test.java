package com.yys.demo10_高级通配符;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/14:47
 */
public class Test {
    public static void main(String[] args) {
        /*
            高级通配符:受限泛型
                上限:<? extends 类名> 只能接收该类类型或者其子类
                下限:<? super 类名> 只能接收该类类型或者其父类
         */
        //String继承了Object  Integer继承了Number ;Number继承了Object
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<Number> list4 = new ArrayList<>();
        method1(list2);
        method2(list1);
        //method2(list2); 他的父类是Number
        method2(list3);
        //method2(list4);//不是String类型
    }

    //只接受list2和list4
    public static void method1(ArrayList<? extends Number> list){
        System.out.println(list);
    }

    //String的父类是Object类型
    public static void method2(ArrayList<? super String> list){

    }
}
