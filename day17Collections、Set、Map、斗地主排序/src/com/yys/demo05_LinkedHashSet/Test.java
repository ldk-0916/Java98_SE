package com.yys.demo05_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/11:17
 */
public class Test {
    public static void main(String[] args) {
        /*
             LinkedHashSet集合:元素存取有序,元素无索引,不可重复()唯一
                采用哈希表+链表结构,由哈希表保证元素唯一,有链表保证存取有序
        */
        //创建LinkedHashSet集合
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
        for (Integer e : set) {
            System.out.println(e);
        }

        HashSet<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("11");
        set1.add("10");
        set1.add("6");
        set1.add("5");
        set1.add("2");
        set1.add("4");
        System.out.println(set1);
        for (String e1: set1) {
            System.out.println(e1);
        }
    }
}
