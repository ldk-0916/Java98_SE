package com.yys03;

/**
 数组操作的常见问题一:
 数组索引越界(超出了范围)异常
 1.问题描述: java.lang.ArrayIndexOutOfBoundsException类,数组索引越界异常类
 2.产生原因:
 使用索引编号范围数组元素时,给出的索引编号不存在(超出了范围)
 索引编号范围: 最小值是0,最大值是数组长度 减 1 (one.length - 1)
 3.解决方案:
 根据控制台的打印信息,找到出现问题的索引,进行修改
 */
public class Demo01ArrayProblem {
    public static void main(String[] args) {
        //创建int数组
        int[] arr = new int[]{10,20,30,40};
        System.out.println(arr);//[I@1540e19d
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //索引4不存在,报出索引越界异常
        //System.out.println(arr[4]);java.lang.ArrayIndexOutOfBoundsException: 4
    }
}
