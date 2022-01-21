package com.yys.demo17_ArrayList类添加元素;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/15:31
 */
public class Test {
    public static void main(String[] args) {
        /*
        ArrayList添加元素的方法:
              public boolean add(E e)：将指定的元素追加到此集合的末尾
              public void add(int index,E element)：在此集合中的指定位置插入指定的元素
         */
        ArrayList<String> list1 = new ArrayList<>();
        //往list1集合中添加元素
        list1.add("王宝强");
        list1.add("贾乃亮");
        list1.add("陈羽凡");
        System.out.println(list1);

        //把吴某凡添加到这个集合当中
        list1.add(0,"吴某凡");
        System.out.println(list1);

    }
}
