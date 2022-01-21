package com.yys.demo10_Stream流中的常用方法;

import com.sun.org.apache.regexp.internal.RE;

import java.util.stream.Stream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/15:24
 */
public class Test_map {
    public static void main(String[] args) {
        /*
            map方法:
                <R> Stream<R> map(Function<? super T, ? extends R> mapper):将流中的元素映射到另一个流
                参数Function<T , R>:函数式接口,抽象方法 R apply(T t);
                其实就是一个类型转换接口(T,R)类型可以一致,也可以不一致
         */
        Stream<String> stream = Stream.of("1", "2", "10", "20", "250");
        //把流元素转换成int类型
        stream.map((String s) -> {return Integer.parseInt(s);}).forEach((Integer i) ->{
            System.out.println(i);
        }) ;

        System.out.println("==========================================");
        //把stream流元素转换成String类型
        Stream<String> stream1 = Stream.of("1", "2", "10", "20", "250");
        stream1.map((String str) ->{return str+":";}).forEach((String i) ->{
            System.out.println(i);
        });

    }
}
