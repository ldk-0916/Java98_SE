package com.yys.demo16_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/13:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            BigDecimal类:
                概述:java.math.BigDecimal 表示超大的小数,并且可以解决小数运算精度的问题
                构造方法:
                BIgDecimal(double val)将double类型的数据封装为Decimal对象
                BIgDecimal(String val):将String类型的数据封装为Decimal对象
                推荐第二种,double会出现精度问题
                成员方法:
                    add         加法运算
                    subtract    减法运算
                    multiply    乘...
                    divide      除...
                 注意:如果除不尽,可以用另一个重载方法 divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
                 divisor:除数对应BigDecimal对象
                 scale:精确地位数
                 roundingMode取舍模式:  RoundingMode枚举: RoundingMode.HALF_UP 四舍五入
         */
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        //加
        BigDecimal res1 = b1.add(b2);
        System.out.println("res1:"+res1);//0.10
        //减
        BigDecimal b3 = new BigDecimal("1.0");
        BigDecimal b4 = new BigDecimal("0.21");
        BigDecimal res2 = b3.subtract(b4);
        System.out.println("res2:"+res2);
        //乘
        BigDecimal b5 = new BigDecimal("100");
        BigDecimal b6 = new BigDecimal("0.201");
        BigDecimal res3 = b5.multiply(b6);
        System.out.println("res3:"+res3);//20.100

        BigDecimal b7 = new BigDecimal("0.09");
        BigDecimal b8 = new BigDecimal("0.01");
        BigDecimal res4 = b7.divide(b8);
        System.out.println("res4:"+res4);

        System.out.println("----------------------------------------");
        BigDecimal b9 = new BigDecimal(0.09);
        BigDecimal b10 = new BigDecimal(0.01);
        System.out.println(b9.add(b10));
        System.out.println("--------------------------------------------------");

        //java.lang.ArithmeticException:除不尽报算数异常;用另一个重载方法
        BigDecimal b11 = new BigDecimal("10");
        BigDecimal b12 = new BigDecimal("3");
       // System.out.println(b11.divide(b12));
        BigDecimal res6 = b11.divide(b12, 2, RoundingMode.HALF_UP);
        System.out.println(res6);
    }
}
