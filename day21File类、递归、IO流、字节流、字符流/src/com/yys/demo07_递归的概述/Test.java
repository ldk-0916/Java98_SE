package com.yys.demo07_递归的概述;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/15:43
 */
public class Test {
    static int count = 0;
    public static void main(String[] args) {
        /*
            程序中的递归:方法自己调用自己这种现象
            注意:
                -   递归要有出口(结束方法),否则会报栈内存溢出错误StackOverflowError
-                   递归的出口不能太晚了
            解决办法:合理递归
         */
        method();
    }
    public static void method(){
        count ++;
        if (count == 100000){//java.lang.StackOverflowError栈内存溢出
            return;
        }
        System.out.println("method方法被执行了....");
        method();
    }
}
