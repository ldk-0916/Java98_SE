package com.yys01;

/**
 1.创建一个int类型的数组,可以存储3个int数据,给该数组起个名称叫做arrayA
 2.创建一个double类型的数组,可以存储7个double数据,给该数组起个名称叫做arrayB
 3.创建一个char类型的数组,可以存储5个char数据,给该数组起个名称叫做arrayC

 数组的第一种初始化方式(动态初始化: 指定数组的长度)
 1.格式:
 数据类型[] 数组名称 = new 数据类型[长度];

 2.格式解释:
 (1)左侧数据类型: 规定了数组中可以存储哪种类型的数据
 (2)左侧[]: 表示数组的意思
 (3)数组名称: 就是给数组起个名字(相当于门牌号),方便找到并使用数组
 (4)=: 表示赋值,把具体的=右边new出来的数组容器,
 存储到=左边的数组变量中,但是存储的是数组在内存空间的地址值
 (5)new: 创建数组容器的过程
 (6)右侧数据类型: 和左侧保持一致
 (7)右侧[]中长度: 是一个int数字,表示数组中可以存储数据的数量,也叫作数组长度

 3.练习:
 (1)创建一个int类型的数组,可以存储3个int数据,给该数组起个名称叫做arrayA
 (2)创建一个double类型的数组,可以存储7个double数据,给该数组起个名称叫做arrayB
 (3)创建一个char类型的数组,可以存储5个char数据,给该数组起个名称叫做arrayC
 */
public class Demo03Array {
    public static void main(String[] args) {
        //创建一个int类型的数组,可以存储3个int数据,给该数组起个名称叫做arrayA
        //int a = 1,b=2,c=3;
        int[] arrayA = new int[3];

        //(2)创建一个double类型的数组,可以存储7个double数据,给该数组起个名称叫做arrayB
        double[] arrayB = new double[7];//只能存储double类型的

        //创建一个char类型的数组,可以存储5个char数据,给该数组起个名称叫做arrayC
        char[] arrayC = new char[5];

    }
}
