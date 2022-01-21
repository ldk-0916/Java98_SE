package com.yys.demo21_方法引用的分类;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/10:29
 */
public class Test1_构造方法的引用 {
    public static void main(String[] args) {
        /*
            构造方法的引用:类名::new
            使用方法引用的步骤
                1.分析要写的Lambda表达式的大括号中是否就是调用另一个方法
                2.如果是,就可以使用方法引用替换,如果不是,就不能使用方法引用
                3.确定引用的方法类型(构造方法,成员方法,静态方法,类的成员方法)
                4.按照对应的格式去引用:
         */
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张三1");
        list.add("张三2");
        list.add("张三3");

        //把集合中的元素打印成Person对象,打印输出
        //获取流,映射,foreach
        list.stream().map(s -> new Person(s)).forEach(System.out::println);

        //map方法中的Lambda表达式大括号内容就是调用Person类的构造方法,符合Lambda替换
        list.stream().map(Person::new).forEach((Person p) ->{
            System.out.println(p);
        });
    }
}
