package com.yys02;

/**
    引用类型作为方法参数传递:
         1.保存的是对象的地址(堆内存空间),要进行参数传递,传递的也是地址值
         2.引用类型变量作为形式参数,通过形式参数找到对应的堆内存空间,修改堆内存空间的内容之后,
         通过实际参数看到的一定是修改后的堆内存空间的内容

         引用类型作为形式参数,形式参数的改变,会影响实际参数

         数组:
         1.数组也是一种引用类型: 数组名称保存的也是数组在堆内存空间的地址值
         2.数组作为方法参数或者返回值: 传递的都是数组在堆内存空间的地址值

 */
public class Demo03Pass {
    public static void main(String[] args) {
        //定义的数组
        int[] arr = new int[]{10,20,30};//引用类型  new出来的对象放在堆内存空间
        System.out.println(arr[0]);

        System.out.println(arr);//[I@1540e19d:地址值
        method(arr);
        System.out.println("方法调用后的:" + arr[0]);
    }
    public static void method(int[] arr){
        System.out.println(arr[0]);//10
        System.out.println(arr[1]);//20
        System.out.println("---------------------------");
        //形式参数*10;发生改变
        arr[0] = arr[0] * 10;
        arr[1] = arr[1] * 10;
        System.out.println("×10过后的值:"+arr[0]);
        System.out.println("×10过后的值:"+arr[1]);
    }
}
