package com.yys.demo04_增强for;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/11:04
 */
public class Test {
    public static void main(String[] args) {
        /*
            概念:
                增强for循环(也称for each循环)是JDK1.5以后出来的一个高级for循环，专门用来遍历数组和集合的。
                它的内部原理其实是个Iterator迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作。
            格式:
                 for (元素的数据类型 变量: 集合/数组) {
                        //操作代码
                 }
         */

        //创建Collection
        Collection<String> col = new ArrayList<>();
        col.add("张三");
        col.add("罗翔");
        col.add("张伟");
        col.add("南山必胜客");

        //快捷键: 集合/数组.for   foreach+anter
        for (String e : col) {
            System.out.println(e);

        }
    }
}
