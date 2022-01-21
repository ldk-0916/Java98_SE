package com.yys.demo07_Objects类;

import java.util.Objects;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/15:08
 */
public class Test {
    public static void main(String[] args) {
        /*
            Objects类:避免这些空指针异常(容忍空指针)
            `public static boolean equals(Object a, Object b)`:判断两个对象是否相等。

            源码:
                public static boolean equals(Object a, Object b) {
                        return (a == b) || (a != null && a.equals(b));
                    }
         */
        String name1 = "罗翔";
        String name2 = new String("罗翔");
        String name3 = null;
        System.out.println(name1);
        System.out.println(name2);

        //比较name1和name2是否相同
        //System.out.println(name1.equals(name2));//true
        //System.out.println(name3.equals(name2));//空指针异常 java.lang.NullPointerException 因为null不能调用方法

        System.out.println(Objects.equals(name1,name2));//true
        System.out.println(Objects.equals(name1,name3));//false
    }
}
