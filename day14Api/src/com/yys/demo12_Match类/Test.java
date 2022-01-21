package com.yys.demo12_Match类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/10:34
 */
public class Test {
    public static void main(String[] args) {
        /*
            Match:
                概述:Match类包含了执行基数数学运算的方法
                特点:不能创建对象,他的构造方法被私有了,因为它内部都是"静态方法",通过"类名直接调用即可"
                Match常用方法:
                     public static int abs(int a) 获取参数a的绝对值：
                     public static double ceil(double a) 向上取整  例如:3.14 向上取整4.0
                     public static double floor(double a) 向下取整 例如:3.14 向下取整3.0
                     public static double pow(double a, double b)  获取a的b次幂
                     public static long round(double a) 四舍五入取整 例如:3.14 取整3  3.56 取整4
                     public static int max(int a, int b)  返回两个 int 值中较大的一个。
                     public static int min(int a, int b)  返回两个 int 值中较小的一个
               Match属性:static double PI
         */
        System.out.println(Math.PI);
        System.out.println("1的绝对值是:"+Math.abs(1));//1
        System.out.println("-1的绝对值是:"+Math.abs(-1));//1
        System.out.println("3.14向上取整"+Math.ceil(3.14));//4
        System.out.println("3.14向下取整"+Math.floor(3.14));//3
        System.out.println("-3.14向上取整"+Math.ceil(-3.14));//-3.0
        System.out.println("-3.14向下取整"+Math.floor(-3.14));//-4.0

        System.out.println("2的3次幂"+Math.pow(2,3));//8.0
        System.out.println("3.14的四舍五入"+Math.round(3.14));//3
        System.out.println("3.14的四舍五入"+Math.round(3.54));//4

        System.out.println(Math.max(100,20));//100 :返回两个数的最大值
        System.out.println(Math.min(100,20));//20  :返回两个数的最小值
    }
}
