package com.yys.demo16_ArrayList类构造方法;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/15:18
 */
public class Test {
    public static void main(String[] args) {
        /*
            ArrayLsit构造方法:
                public ArrayList():构造一个初始容量为 10 的空列表

                基本数据类型          对应的             包装类类型
                byte                                     Byte
                short                                    Short
                int                                      Integer
                long                                     Long
                double                                   Double
                float                                    Float
                boolean                                  Boolean
                char                                     Character
         */
        //创建ArrayList集合,限制集合元素类型为String类型
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();//后面的泛型可以省略
        //创建ArrayList集合,限制集合元素类型为Student类型
        ArrayList<Student> list3 = new ArrayList<>();

        //创建ArrayList集合,限制集合元素类型为int类型的包装类Integer类型
        ArrayList<Integer> list4 = new ArrayList<>();

        //创建ArrayList集合,不限制集合类型
        ArrayList list5 = new ArrayList();//可以存储任意类型对象
    }
}
