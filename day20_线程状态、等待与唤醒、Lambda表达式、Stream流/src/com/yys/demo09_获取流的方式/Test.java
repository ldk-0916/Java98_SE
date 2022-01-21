package com.yys.demo09_获取流的方式;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/13:58
 */
public class Test {
    public static void main(String[] args) {
        /*
            根据Collection获取流:
                Collection<E>接口中有一个stream()方法,可以获取流,default Stream<E> stream()
                    1.根据List获取流
                    2.根据Set获取流

             根据Map获取流:
                1.根据Map集合的键来获取流
                2.根据Map集合的值来获取流
                3.根据Map集合的键值对对象来获取流

             根据数组获取流
                Stream接口中有一个方法,可以获取流:public static <T> Stream<T> of(T... values)

         */
        //1.创建List集合
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        Stream<String> stream1 = list.stream();
        //创建Set集合
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("罗翔");
        Stream<String> stream2 = set.stream();

        System.out.println("------------------------------------------");

        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"java");
        map.put(1,"C++");
        map.put(1,"Php");
        map.put(1,"Python");
        map.put(1,"C");
        map.put(1,"go");

        //根据集合的键来获取流
        Set<Integer> keys = map.keySet();
        Stream<Integer> stream3 = keys.stream();

        //根据值来获取流
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //根据对象来获取
        Set<Map.Entry<Integer, String>> entrys = map.entrySet();
        Stream<Map.Entry<Integer, String>> stream5 = entrys.stream();
        System.out.println("=======================================");

        //根据数组获取流
        String[] arr = {"张三","李四","王五","罗翔"};
        Stream<String> stream6 = Stream.of(arr);

        //直接获取流
        Stream<String> stream7 = Stream.of("张三", "李四", "王五", "罗翔");

    }
}
