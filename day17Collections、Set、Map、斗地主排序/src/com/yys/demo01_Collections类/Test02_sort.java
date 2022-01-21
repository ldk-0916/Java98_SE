package com.yys.demo01_Collections类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/22/15:36
 */
public class Test02_sort {
    public static void main(String[] args) {
        /*
        Collections排序
               public static <T> void sort(List<T> list，Comparator<? super T> )`:将集合中元素按照指定规则排序
         */
        //创建集合
        List<Integer> list1 = new ArrayList<>();
        //添加元素
        list1.add(100);
        list1.add(300);
        list1.add(250);
        list1.add(50);
        System.out.println("排序之前:"+list1);
        //按照降序排
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //排序规则
                //o1 - o2升序(前减后)
                //o2 - o1降序(后减前)
                //前:第一个参数01  后:第二个参数o2;
                return o2 - o1;
            }
        });
        System.out.println("排序后:"+list1);
        /*
            升序略...你们写
         */

        System.out.println("========================================");
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(19));
        list2.add(new Student(11));
        list2.add(new Student(21));
        list2.add(new Student(16));
        System.out.println("排序之前:"+list2);
        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age;
            }
        });
        System.out.println("降序排序之后:"+list2);
    }
}
