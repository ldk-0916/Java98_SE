package com.yys.demo02_权限修饰符;

import com.yys.demo01_权限修饰符.A;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/10:49
 */
//不同包的子类
public class Zi extends A {
    public void method(){
        /*
            不同包的子类,只有public 和 protected修饰的能够访问
         */
        method1();
        method2();
        //method3()编译报错,没有访问权限
        //method4();//编译报错,没有访问权限
    }
}
