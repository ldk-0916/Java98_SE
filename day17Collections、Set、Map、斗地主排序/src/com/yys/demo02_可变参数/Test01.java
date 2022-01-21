package com.yys.demo02_可变参数;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/9:14
 */
public class Test01 {
    public static void main(String[] args) {
        /*
            可变参数:在jdk1.5之后,如果我们定义一个方法需要接受多个参数,并且多个参数类型一致,我们就可以对其简化
            格式:
                修饰符 返回值类型 方法名(参数类型... 形式参数名称){....}
         */

        method1(1,2,3,4,5,6,7,8,9,10,11);
        int[] arr = {1,2,3};
        method2(arr);
    }
    //1.定义一个方法,接收10个int类型参数
    public static void method1(int... nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
        }
    }

    //2.定义一个方法,接收3个int类型参数
    public static void method2(int[]... arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }

    public static void method3(int num1,int num2,int num3){}
    /*
        最原始的方法,传输参数类型相同,可以使用上面的简化方法
     */
}
