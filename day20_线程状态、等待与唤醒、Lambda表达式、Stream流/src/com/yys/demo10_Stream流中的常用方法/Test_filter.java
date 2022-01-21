package com.yys.demo10_Stream流中的常用方法;

import java.util.stream.Stream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/15:05
 */
public class Test_filter {
    public static void main(String[] args) {
        /*
            filter过滤:
                Stream<T> filter(Predicate<? super T> predicate);过滤出满足条件的元素
                参数Predicate:函数式接口,抽象方法 boolean test(T t);
                Predicate接口:是一个判断接口
         */
        Stream<String> stream = Stream.of("张三", "李四", "脏无忌", "义","张三丰","张无忌");
        //过滤出姓张的元素
        stream.filter((String name) ->{
            return name.startsWith("张");
        }).forEach((String name) ->{
            System.out.println(name);
        });

    }
}
