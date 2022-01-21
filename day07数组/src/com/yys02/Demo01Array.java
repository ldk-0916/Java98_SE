package com.yys02;

/**
 一个数组内存图

 注意:
 1.数组名称保存数组在堆内存中的地址值
 2.通过数组名称找到堆内存中的具体数组,然后通过索引编号找到对应的具体的某个元素

 数组元素有默认值:
 1.整数:       0
 2.小数:       0.0
 3.字符:       空白字符
 4.布尔:       false
 */
public class Demo01Array {
    public static void main(String[] args) {
        //创建一个数组int类型的
        int[] arr = new int[2];//第一个元素索引为0,第二个元素索引为1
        System.out.println(arr);//[I@1540e19d  16进制的地址值

        System.out.println(arr[0]);//索引为0的元素,默认值是:0
        System.out.println(arr[1]);//默认值值为0

        arr[0] = 10;//把整数数字10,存储到数组arr中,索引编号为0的元素中,默认值0被10覆盖
        arr[1] = 20;//....------------------          编号为1的元素   默认值0 被20覆盖了

        System.out.println(arr);//[I@1540e19d  地址值没有发生改变
        System.out.println(arr[0]);
        System.out.println("--------------------------");
        double[] d = new double[2];
        System.out.println(d[0]);//默认值:0.0
        System.out.println("--------------------------------------");
        char[] chars = new char[2];
        System.out.println(chars[0]+":");//默认值是空白字符
        System.out.println("--------------------------------------------");
        boolean[] b = new boolean[2];
        System.out.println(b[0]);//默认值:false
    }
}
