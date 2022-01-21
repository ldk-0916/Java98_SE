package com.yys.demo11_List接口;

import java.util.LinkedList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/22/11:16
 */
public class LinkListTest {
    public static void main(String[] args) {
        /*
        - `public void addFirst(E e)`:将指定元素插入此列表的开头。
        - `public void addLast(E e)`:将指定元素添加到此列表的结尾。
        - `public E getFirst()`:返回此列表的第一个元素。
        - `public E getLast()`:返回此列表的最后一个元素。
        - `public E removeFirst()`:移除并返回此列表的第一个元素。
        - `public E removeLast()`:移除并返回此列表的最后一个元素。
        - `public E pop()`:从此列表所表示的堆栈处弹出一个元素,相当于删除并返回此列表的第一个元素。 rmoveFirst
        - `public void push(E e)`:将元素推入此列表所表示的堆栈。换句话说，在该列表的前面插入元素。 addFirest
         */
        //创建LinkedList对象
        LinkedList<String> list = new LinkedList();
        //往集合中添加元素
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        //在列表首尾各添加一个元素
        list.addFirst("小明");
        list.addLast("小花");
        System.out.println(list);

        //返回此列表第一个和最后一个元素
        String first = list.getFirst();
        String last = list.getLast();
        System.out.println("获取第一个元素:"+first);
        System.out.println("获取最后一个元素:"+last);

        //移除并返回此列表的第一个和最后一个元素
        String firstRemove = list.removeFirst();
        String lastRemove = list.removeLast();
        System.out.println("返回被移出的第一个元素:"+firstRemove);
        System.out.println("返回被移除的最后一个元素:" + lastRemove);

        //public E pop()`:从此列表所表示的堆栈处弹出一个元素。
        String pop = list.pop();
        System.out.println(pop);//张三

        //添加一个元素再开头
        list.push("罗翔");
        System.out.println(list);
    }
}
