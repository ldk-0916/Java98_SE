package com.yys.demo01_权限修饰符;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/10:35
 */
public class A {
    //定义4个不同权限修饰符修饰的方法
    public void method1(){
        System.out.println("public修饰的method1....");
    }
    protected void method2(){
        System.out.println("protected修饰method2...");
    }
    void method3(){
        System.out.println("默认修饰的method3...");
    }
    private void method4(){
        System.out.println("私有修饰的method4");
    }

    public void method(){
        method1();
        method2();
        method3();
        method4();
    }
}
