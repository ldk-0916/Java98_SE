package com.yys.demo01_Collections类;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/22/15:12
 */
public class Test_sort {
    public static void main(String[] args) {
        /*
            Collections常用功能:
            `public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序(升序)
            默认排序:事先写好的排序规则
            排序规则:集合中所有元素所属类型一定要实现Comparable接口,重写CompareTo方法,在这个方法中指定排序规则
         */
        //1.创建集合List ,限制为Integer
        ArrayList<Integer> list = new ArrayList<>();
        //2.向集合中添加元素
        list.add(110);
        list.add(120);
        list.add(119);
        list.add(12580);
        list.add(10086);
        System.out.println("排序之前的集合:"+list);
        Collections.sort(list);
        System.out.println("排序之后的集合:"+list);//[110, 119, 120, 10086, 12580]

        System.out.println("=============================");
        //创建一个集合,存储类型为学生(Student)对象
        ArrayList<Student> list1 = new ArrayList<>();
        //往集合中添加元素
        //创建学生对象
        Student stu1 = new Student(18);
        Student stu2 = new Student(28);
        Student stu3 = new Student(25);
        Student stu4 = new Student(16);
        list1.add(stu1);
        list1.add(stu2);
        list1.add(stu3);
        list1.add(stu4);
        System.out.println("排序前:"+list1);
        Collections.sort(list1);//编译报错
        System.out.println("排序后:" + list1);//
    }
}
