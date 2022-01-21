package com.yys.demo09_泛型通配符;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/14:47
 */
public class Test {
    public static void main(String[] args) {
        /*
            泛型通配符:
                不知道使用什么类型来接收的时候,此时就可以使用?; ?表示未知通配符
                注意:只能获取数据,不能往集合中存储数据
         */
        //String继承了Object  Integer继承了Number ;Number继承了Object
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<Number> list4 = new ArrayList<>();
        list3.add("张三");
        method1(list3);
        //method2(list3);
    }

    //接收上面的集合
    public static void method1(ArrayList list){
        Object obj = list.get(0);
        list.add("罗翔");
        list.add(1);
        System.out.println("obj:"+obj);
        System.out.println("list:"+list);
    }

    public static void method2(ArrayList<?> list){
        Object obj = list.get(0);
        //list.add("罗翔");//编译报错,因为使用泛型通配符只能获取,不能添加数据
        System.out.println("obj:"+obj);
    }
}
