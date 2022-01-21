package com.yys.demo05_泛型的作用;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/11:13
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            泛型的作用:定义的时候表示一种未知的数据类型,在使用的时候确定其具体类型
            限制存取元素类型
            ArrayList<E/T>
         */
        //创建ArrayList集合,不确定他的泛型类型
        ArrayList list = new ArrayList();
        //添加元素
        list.add(1);
        list.add("罗翔");
        list.add(3.14);
        System.out.println(list);

        //遍历集合
       /* for (Object obj : list) {
            String name = (String) obj;//类转换异常java.lang.ClassCastException
            System.out.println("姓名的长度"+name.length());
        }*/

       //创建集合,限制类型为String类型
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");
        //list2.add(10);//编译报错,因为创建集合的时候我们限制了存储的元素类型为String,所以,无法添加其他类型,所以会报错;
        for (String s : list2) {
            System.out.println(s.length());//2
        }
    }
}
