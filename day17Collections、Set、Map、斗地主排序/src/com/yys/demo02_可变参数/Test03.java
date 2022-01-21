package com.yys.demo02_可变参数;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/9:35
 */
public class Test03 {
    public static void main(String[] args) {
        /*
            应用场景:Collections
                在Collections中也提供了添加一些元素方法：
    ​	        public static <T> boolean addAll(Collection<T> c, T... elements) :往集合中添加一些元素。
         */
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();
        //批量添加(往集合中)
        Collections.addAll(list,"张三","李四","罗翔");
        System.out.println(list);
    }
}
