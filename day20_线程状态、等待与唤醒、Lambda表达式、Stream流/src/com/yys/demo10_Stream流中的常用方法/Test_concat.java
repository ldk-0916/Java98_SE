package com.yys.demo10_Stream流中的常用方法;

import java.util.stream.Stream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/15:35
 */
public class Test_concat {
    public static void main(String[] args) {
        /*
            static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b):合并2个流
         */
        //获取Stream流
        Stream<String> stream1 = Stream.of("1", "2", "3", "4");
        Stream<String> stream2 = Stream.of("脏无忌", "义", "杨政", "曹岩","黄宇军");
        //把1和2合并成一个流
        Stream<String> stream = Stream.concat(stream1, stream2);
        stream.forEach(name -> System.out.println(name));
    }
}
