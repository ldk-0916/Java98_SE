package com.yys.demo18_集合存储基本数据类型以及指定位置添加元素的注意事项;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/15:37
 */
public class Test {
    public static void main(String[] args) {
        //王集合中存储int整数
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);
        System.out.println("-------------------------------------------");
        //基本类型-->包装类
        Integer i = 100;//自动装箱:系统会把基本类型数据自动装想到包装类类型
        int num = i;   //自动拆箱:系统会把包装类类型的数据自动拆分为基本类型数据
    }
}
