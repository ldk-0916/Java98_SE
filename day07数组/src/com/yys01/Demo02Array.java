package com.yys01;

/**
 1.数组变量定义格式一：			---------------推荐使用-------------
 数据类型[] 数组名称;

 2.数组变量定义格式二：
 数据类型 数组名称[];


 1.定义一个存储int类型数组的变量arrayA
 2.定义一个存储double类型数组的变量arrayB
 3.定义一个存储char类型数组的变量arrayC
 */
public class Demo02Array {
    public static void main(String[] args) {
        //定义一个变量
        int num ;
        //System.out.println(num);错误:变量没有初始化,不能使用

        //定义一个数组
        // 1.定义一个存储int类型数组的变量arrayA
        int[] arrayA;//只能存储int类型的
        //System.out.println(arrayA);arrayA只是一个用来存储数组的变量,里面没有存储数据(没有初始化),所以报错

    //     2.定义一个存储double类型数组的变量arrayB
        double[] arrayB;//double类型的数组:只能存储double类型的

        // 3.定义一个存储char类型数组的变量arrayC
        char[] arrayC;//只能存储char类型的数据
    }
}
