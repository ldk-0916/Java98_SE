package com.yys.demo01_Collections类;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/22/15:06
 */
public class Test01_shuffle {
    public static void main(String[] args) {
        /*
            Collections常用功能:
                `public static void shuffle(List<?> list) :打乱集合顺序。
         */
        //1.创建集合List ,限制为Integer
        ArrayList<Integer> list = new ArrayList<>();
        //2.向集合中添加元素
        list.add(110);
        list.add(120);
        list.add(119);
        list.add(12580);
        list.add(10086);
        System.out.println("打乱排序之前的集合:"+list);

        //打乱
        Collections.shuffle(list);
        System.out.println("打乱之后的集合"+list);

    }
}
