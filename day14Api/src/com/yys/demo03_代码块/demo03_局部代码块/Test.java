package com.yys.demo03_代码块.demo03_局部代码块;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/11:13
 */
public class Test {
    public static void main(String[] args) {
        /*
            局部代码块:
                格式:{}
                位置:方法中
                执行:调用方法,执行到了局部代码块的时候就执行了
                使用场景:节省内存空间,没啥意义...
         */
        System.out.println("程序开始了...");
        {
            int num1 = 20;
            System.out.println("局部代码块...");
        }
        Person p = new Person();
        p.method();
        System.out.println("程序结束了...");
    }
}
