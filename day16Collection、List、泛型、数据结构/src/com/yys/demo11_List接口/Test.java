package com.yys.demo11_List接口;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/22/11:01
 */
public class Test {
    public static void main(String[] args) {
        /*
            List接口常用方法
                public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
                public E get(int index)`:返回集合中指定位置的元素。
                public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
                public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素
         */
        //创建List集合,限制类型为String
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]

        //指定位置添加
        list.add(1,"罗翔");
        System.out.println(list);//[张三, 罗翔, 李四, 王五]

        //根据下标获取指定元素
        System.out.println("获取下标为1的元素是:"+list.get(1));

        //获取删除罗翔
        String res = list.remove(1);
        System.out.println("删除的元素:"+res);

        //王五换成赵八
        String set = list.set(2, "赵八");
        System.out.println("被替换的元素:"+set);
        System.out.println(list);
    }
}
