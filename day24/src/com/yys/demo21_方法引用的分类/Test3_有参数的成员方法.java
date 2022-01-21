package com.yys.demo21_方法引用的分类;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/10:49
 */
public class Test3_有参数的成员方法 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张三1");
        list.add("张三2");
        list.add("张三3");
        //打印输出
        list.stream().forEach(str -> System.out.println(str));
        //同理
        list.stream().forEach(System.out::println);
    }
}
