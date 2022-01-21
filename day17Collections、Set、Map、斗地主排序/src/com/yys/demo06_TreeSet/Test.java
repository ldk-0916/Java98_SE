package com.yys.demo06_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/13:35
 */
public class Test {
    public static void main(String[] args) {
        /*
            TreeSet集合:元素无索引、唯一,对元素进行排序
                通过构造方法实现排序
                    public TreeSet():构造一个新的，空的树组，根据其元素的自然排序进行排序。
                    默认排序规则:集合中所属的类需要实现Comparable接口,重写comparTo方法,在这个方法中指定排序规则

                    public TreeSet(Comparator<? super E> comparator)
                    指定排序规则:通过传入comparator 接口的实现类对象,在实现类中重写compare方法,在这个方法中指定排序规则
         */
        //创建TreeSet集合对象
        TreeSet<Integer> set1 = new TreeSet<>();

        //匿名内部类方式创建
        TreeSet<Integer> set2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*
                    降序:
                    指定排序规则:
                        前减后:升序
                        后减前:降序
                 */
                return o2 - o1;
            }
        });
        set2.add(10);
        set2.add(11);
        set2.add(21);
        set2.add(33);
        set2.add(9);
        System.out.println(set2);

    TreeSet<Integer> set3 = new TreeSet<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    });

        set3.add(100);
        set3.add(11);
        set3.add(21);
        set3.add(33);
        set3.add(9);
        System.out.println(set3);
    }

}
