package com.yys.demo18_Integer类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/15:12
 */
public class Test {
    public static void main(String[] args) {
        /*
            Integer类:
                概述:包装一个对象中的原始类型 int的值
                构造方法:
                    public Integer(int value)    根据int值创建Integer 对象  过时
                    public Integer(String value) 根据String值创建Integer 对象 过时
                    valueOf(int i) 返回一个 Integer指定的 int值的 Integer 实例。
                    valueOf(String s) 返回一个 Integer 对象，保存指定的值为 String  。
                    intValue() 将 Integer的值作为 int 。
         */
        //int--->Integer
        Integer i1 = new Integer(10);//i1对象表示的就是整数10
        Integer i2 = Integer.valueOf(10); // i2对象表示整数的就是10

        //String-->Integer
        Integer i3 = new Integer("10");//i3对象表示整数的就是10
        Integer i4 = Integer.valueOf("100");//i4对象表示的整数就是10
        //Integer-->int
        int num1 = i1.intValue();
        int num2 = i2.intValue();
        int num3 = i3.intValue();
        int num4 = i4.intValue();
    }
}
