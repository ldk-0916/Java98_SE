package com.yys.demo20_ArrayList存储字符串并遍历;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/9:13
 */
public class Test {
    public static void main(String[] args) {
    //    创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("罗翔");

        //获取元素个数
        int size = list.size();
        for (int i = 0; i < size; i++) {
            //在循环中获取元素
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
