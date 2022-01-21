package com.yys03;

/**
 数组操作的常见问题二:
 空指针异常
 1.问题描述: java.lang.NullPointerException类,空指针异常类
 2.产生原因:
 null是一个引用类型的常量,可以给任意类型引用变量赋值,
 当把null赋值给数组变量one之后,数组变量one将不再指向堆内存空间的任何数组,
 也就不可以通过one再访问数组元素,只要访问,报出空指针异常

 3.解决方案:
 (1)不要通过值为null的数组变量,访问数组元素
 (2)根据控制台打印的相关异常信息,找到数组变量是null的地方进行修改,
 让数组变量指向一个堆内存空间的数组,就可以访问数组元素了
 */
public class Demo02ArrayProblem {
    public static void main(String[] args) {
        int[] one = new int[]{10,20,30};//one代表内存地址(数组的)
        System.out.println(one);//[I@1540e19d
        System.out.println(one[0]);
        System.out.println(one[1]);
        System.out.println(one[2]);
        one = null;
        System.out.println(one);//null
        System.out.println(one[0]);
    }
}
