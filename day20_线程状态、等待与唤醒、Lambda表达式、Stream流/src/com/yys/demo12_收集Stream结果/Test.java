package com.yys.demo12_收集Stream结果;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/15:58
 */
public class Test {
    public static void main(String[] args) {
        /*
            Stream<T>流中提供了一个方法,可以把流中的数据收集到单列集合中:
                <R,A> R collect(Collector<? super T,A,R> collector): 把流中的数据收集到单列集合中
                    返回值类型是R,也就是说R指定为什么类型,就是收集到什么类型的集合
                    参数Collector<? super T,A,R>中的R类型: 决定把流中的元素收集到哪个集合中

                - 参数Collector如何得到? 使用java.util.stream.Collectors工具类中的静态方法:
                    - public static <T> Collector<T, ?, List<T>> toList()：转换为List集合。
                    - public static <T> Collector<T, ?, Set<T>> toSet()：转换为Set集合
         */
        //以前的方式
        List<String> list =  new ArrayList<>();
        list.add("脏无忌");
        list.add("张三丰");
        list.add("张三");
        list.add("张二麻子");
        list.add("李云龙");
        list.add("楚云飞");
        list.add("张大彪");
        //过滤出姓张的,并且长度为3
        Stream<String> stream = list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3);
        //把收集到的元素放到数组里面
        Object[] arr = stream.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
