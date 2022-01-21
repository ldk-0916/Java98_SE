package com.yys.demo21_方法引用的分类;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/10:52
 */
public class Test4_类常用方法的应用 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张一山");
        list.add("张三丰");
        list.add("张鹤伦");
        list.stream().map((String name) -> {
            return name.length();
        }).forEach(System.out::println);

        //同理:
        list.stream().map(String::length).forEach(System.out::println);
    }
}
