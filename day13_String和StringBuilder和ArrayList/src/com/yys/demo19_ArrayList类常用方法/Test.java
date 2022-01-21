package com.yys.demo19_ArrayList类常用方法;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/15:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            public boolean   remove(Object o) 删除指定的元素，返回删除是否成功
            public E   remove(int   index) 删除指定索引处的元素，返回被删除的元素
            public E   set(int index, E  element) 修改指定索引处的元素，返回被修改的元素
            public E   get(int   index) 返回指定索引处的元素
            public int   size() 返回集合中的元素的个数
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
        //删除吴某凡
        //list1.remove("吴某凡");
        //System.out.println(list1);

        //2public E   remove(int   index) 删除指定索引处的元素，返回被删除的元素
        //String element = list1.remove(0);
        //System.out.println(element);
        String element1 = list1.set(0, "罗志祥");
        System.out.println(element1);
        System.out.println(list1);
        System.out.println("---------------------------------------");
        //3. public E   get(int   index) 返回指定索引处的元素
        String element2 = list1.get(0);
        System.out.println(element2);

        System.out.println(list1.size());//返回集合中元素个数:4

    }
}
