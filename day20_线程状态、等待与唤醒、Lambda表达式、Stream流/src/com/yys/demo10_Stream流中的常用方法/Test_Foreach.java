package com.yys.demo10_Stream流中的常用方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/14:23
 */
public class Test_Foreach {
    public static void main(String[] args) {
        /*
            Foreach方法:
                void forEach(Consumer<? super T> action);:逐一处理流中的元素
                  参数Consumer<T>: 函数式接口,抽象方法void accept(T t);

                注意:
                    1.方法并不保证元素的逐一消费动作在流中是被有序执行的。
                    2.Consumer是一个消费接口
         */
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张大仙");
        list.add("罗翔");
        list.add("张伟");

        //函数模型:获取流->逐一消费流中的元素
        list.stream().forEach((String e) ->{
            System.out.println(e);
        });

        //并行流:通过Collection的parallelStream()方法可以得到并行流
        list.parallelStream().forEach((String e) ->{
            System.out.print(e+" ");
        });
    }
}
