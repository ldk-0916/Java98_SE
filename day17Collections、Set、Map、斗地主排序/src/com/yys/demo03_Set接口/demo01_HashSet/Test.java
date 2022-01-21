package com.yys.demo03_Set接口.demo01_HashSet;

import java.util.HashSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/9:47
 */
public class Test {
    public static void main(String[] args) {
        /*
            Hashset:
                set接口的一个实现类,它所存储的元素是不可重复的,并且元素顺序是无序的(即存取顺序不能保证一致)
         */
        //首先创建HashSet集合对象
        HashSet<String> set = new HashSet<>();

        //添加元素到集合中
        //Collections.addAll()
        set.add("张鹤伦");
        set.add("郎鹤焱");
        set.add("郭麒麟");
        set.add("秦霄贤");
        set.add("郭德纲");
        System.out.println(set);//[郎鹤焱, 郭麒麟, 张鹤伦, 秦霄贤]

        //增强for获取
        for (String e : set) {
            System.out.println(e.hashCode());
        }

    }
}
