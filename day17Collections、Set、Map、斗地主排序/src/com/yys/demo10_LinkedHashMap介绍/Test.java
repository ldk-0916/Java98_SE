package com.yys.demo10_LinkedHashMap介绍;

import java.util.LinkedHashMap;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/15:30
 */
public class Test {
    public static void main(String[] args) {
        /*
            LinkedHashMap:元素存取有序,键唯一,值可以重复
                --通过链表的结构可以保证元素存取顺序一致
                --通过哈希表结构可以保证键的唯一,不重复,需要重写HashCode和equals
         */
        //创建LinkedHashMap集合
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        //添加键值对
        map.put("刘思清","苏大");
        map.put("王辰希","北大");
        map.put("陈宇明","复旦");
        System.out.println(map);

    }
}
