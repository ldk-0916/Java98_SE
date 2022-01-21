package com.yys.demo12_集合嵌套.demo01_List嵌套List;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/16:23
 */
public class Test {
    public static void main(String[] args) {
        /*
            List嵌套List:List集合里面的元素是List集合
         */
        //创建List集合
        List<String> list1 = new ArrayList<>();
        //添加元素
        list1.add("宝强");
        list1.add("乃亮");
        list1.add("羽凡");

        //创建list2集合
        List<String> list2 = new ArrayList<>();
        //添加元素
        list2.add("马蓉");
        list2.add("小璐");
        list2.add("百合");

        //创建list集合,存储list1和list2
        List<List<String>> list = new ArrayList<>();
        //添加元素
        list.add(list1);
        list.add(list2);
        System.out.println(list);
        System.out.println(list.size());//个数

        //遍历
        for (List<String> e : list) {
            for (String s: e) {
                System.out.println(s);
            }
        }
    }
}
