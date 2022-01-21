package com.yys.demo05_Lambda表达式的格式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/10:26
 */
public class Test {
    public static void main(String[] args) {
        /*
            Lambda表达式的格式:
                标准格式:(参数列表) ->{代码}
                小括号里面的参数列表和传统参数列表一致,可以无参,多个参数用逗号隔开
                ->就是新引入的语法格式,代表指向动作
                大括号内和传统语法一样..

                - 案例演示:
                    线程案例
                    比较器案例

              格式解释:
                1.小括号中书写的内容和接口中的抽象方法的参数列表一致
                2.大括号中书写的内容和实现接口中的抽象方法的方法体一致
                3.箭头就是固定的

            Lambda表达式的使用条件: 接口中有且仅有一个抽象方法的接口,才可以使用Lambda表达式
                    1.接口中只有一个抽象方法的接口,叫做函数式接口
                    2.如果是函数式接口,那么就可以使用@FunctionalInterface注解来标识

                  使用Lambda表达式:
                    1.判断接口是否是函数式接口
                    2.如果是函数式接口,那么就直接写()->{}
                    3.然后填充小括号和大括号中的内容
         */
        //线程案例,创建线程任务
        new Thread(() ->{
            System.out.println("任务代码....");
        }).start();

        //按照降序排序
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(14);
        list.add(22);
        System.out.println("排序前:"+list);

        /*Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("排序后:"+list);*/
        Collections.sort(list,(Integer o1,Integer o2) ->{
            return o2 - o1;
        });
        System.out.println("排序后:"+list);
    }
}
