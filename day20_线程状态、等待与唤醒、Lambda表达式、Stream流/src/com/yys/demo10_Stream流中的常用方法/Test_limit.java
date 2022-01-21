package com.yys.demo10_Stream流中的常用方法;

import java.util.stream.Stream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/15:13
 */
public class Test_limit {
    public static void main(String[] args) {
        /*
            limit方法:
                Stream<T> limit(long maxSize);取用前几个
                注意:参数是一个long类型,如果流的长度大于参数则进行截取,否则不进行操作
         */
        Stream<String> stream = Stream.of("张三", "李四", "脏无忌", "义", "张三丰", "张无忌");
        //保留前三个元素
        stream.limit(3).forEach(name -> System.out.println(name));
        System.out.println("---------------------------------------");

        // 注意:参数是一个long类型,如果流的长度大于参数则进行截取,否则不进行操作
        Stream<String> stream1 = Stream.of("张三", "李四", "脏无忌", "义", "张三丰", "张无忌");
        //保留前三个
        stream1.limit(7).forEach(name -> System.out.println(name));
    }
}
