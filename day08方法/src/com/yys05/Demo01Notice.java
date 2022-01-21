package com.yys05;

import java.security.PublicKey;

/**
 方法的注意事项
    1.方法不能嵌套定义(在定义方法的内部又定义了其它方法),可以调用其它方法
    2.方法可以嵌套调用
    3.返回值类型，必须要和 return 语句返回的数据的类型要匹配，否则编译失败 。
    4.不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
    5.void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据
 */
public class Demo01Notice {
    public static void main(String[] args) {
        //method2(1);
        //方法里面嵌套方法
        method2(method3());
    }
    //定义方法
   /* public static void method1(){
        //方法里面不可以嵌套方法
        //public static void method1(){}
    }*/

    public static void method2(int num){
        System.out.println(num);
    }
    public static int method3(){
        return 10;
    }
}
