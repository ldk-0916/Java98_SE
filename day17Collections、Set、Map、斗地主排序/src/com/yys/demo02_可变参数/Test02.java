package com.yys.demo02_可变参数;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/9:29
 */
public class Test02 {
    public static void main(String[] args) {
        /*
            可变参数注意事项:
                1.一个方法,只能有一个可变参数
                2.如果有多个参数,就把可变参数放在最后
         */

    }

    //编译报错,因为可变参数要放在后面
    /*public static void method1(int... nums,String){

    }*/
    //正确的
    public static void method2(String str, int... nums){

    }
    /*public static void method3(String... str,int...nums){
        编译报错,只能有一个可变参数
    }*/
}
