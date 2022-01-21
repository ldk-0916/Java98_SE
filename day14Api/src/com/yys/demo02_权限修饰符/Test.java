package com.yys.demo02_权限修饰符;

import com.yys.demo01_权限修饰符.A;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/10:52
 */
public class Test {
    public static void main(String[] args) {
        /*
            不同包的无关类,只有public修饰的可以访问
         */
        //访问A中的4个方法
        A a = new A();
        a.method1();
        //a.method2();//编译报错;没有访问权限
        //a.method3();//编译报错;没有访问权限
        //a.method4();//编译报错;没有访问权限
    }
}
