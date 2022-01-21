package com.yys.demo10_Stream流中的常用方法;

import java.util.stream.Stream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/15:20
 */
public class Test_skip {
    public static void main(String[] args) {
        /*
            skip方法:
                Stream<T> skip(long n);跳过前几个元素
                如果流的当前长度大于n,则跳过n个;否则将会得到一个长度为0的流
         */
        Stream<String> stream = Stream.of("张三", "李四", "脏无忌", "义", "张三丰", "张无忌");

        //跳过前2个元素
        stream.skip(2).forEach(name -> System.out.println(name));
    }
}
