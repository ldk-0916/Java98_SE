package com.yys.demo10_Stream流中的常用方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/15:01
 */
public class Test_Count {
    public static void main(String[] args) {
        /*
            count:
                long count():统计流中元素个数
         */
        List<String> list = new ArrayList<>();
        list.add("张鹤伦");
        list.add("郎鹤焱");
        list.add("张伯伦");
        list.add("贾巴尔");
        list.add("拉塞尔");
        long count = list.stream().count();
        System.out.println("流中元素个数:"+count);
        System.out.println(list.size());
    }
}
