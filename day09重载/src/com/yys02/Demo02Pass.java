package com.yys02;

/**
   1.基本类型变量: 保存的是具体的数据值
   2.基本类型变量作为形式参数,形式参数的改变不会影响实际参数
    method方法里面的参数叫做形式参数:可以任意改变,不会影响实际参数的传递
    实际参数:调用方发时,()中给的参数
 */
public class Demo02Pass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a,b);
    }
    public static void method(int x,int y){
        int sum = x + y;
        System.out.println(sum);
    }
}
