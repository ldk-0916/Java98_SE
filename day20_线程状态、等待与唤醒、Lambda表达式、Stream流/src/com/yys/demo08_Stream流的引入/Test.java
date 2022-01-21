package com.yys.demo08_Stream流的引入;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/13:38
 */
public class Test {
    public static void main(String[] args) {
        /*
            例如: 有一个List集合,要求:
                1. 将List集合中姓张的的元素过滤到一个新的集合中
                2. 然后将过滤出来的姓张的元素,再过滤出长度为3的元素,存储到一个新的集合中
         */
        //1.创建一个List集合
        List<String> list = new ArrayList<>();
        list.add("张景尧");
        list.add("张学友");
        list.add("张杰");
        list.add("张铁林");
        list.add("张一山");
        list.add("张三");
        list.add("刘思清");
        list.add("刘大山");
        //2.将List集合中姓张的的元素过滤到一个新的集合中
        //创建新的将集合来存储姓张的元素
        ArrayList<String> list1 = new ArrayList<>();
        for (String name :list) {
            //进行判断,姓张的添加到新的集合中
            if (name.startsWith("张")){
                list1.add(name);
            }
        }
        System.out.println(list1);

        //3.然后将过滤出来的姓张的元素,再过滤出长度为3的元素,存储到一个新的集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list1) {
            if (name.length() == 3){
                list2.add(name);
            }
        }
        System.out.println(list2);

        System.out.println("==================================================");
        list.stream().filter(name -> name.startsWith("张")).filter(name ->name.length() == 3).forEach(e -> System.out.println(e));
    }
}
