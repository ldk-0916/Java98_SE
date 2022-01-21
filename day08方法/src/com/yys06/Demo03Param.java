package com.yys06;

/**
 形式参数:
 创建方法时,方法名后的()里面给的参数,叫形式参数
    特点:
     a.定义形式参数的时候,是没有值的
     b.当调用该方法时,形式参数才会有值
 实际参数:
    调用方法时()给的参数(常量/变量),叫实际参数
    特点:必须要有具体的值,调用方法时()的给的数据
 */
public class Demo03Param {
    public static void main(String[] args) {
        int x = 10,y = 20;
        method(x,y);
    }

    public static void method(int a, int b) {
        int sum = a + b;
        System.out.println("结果:"+sum);
    }
}
