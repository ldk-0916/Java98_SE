package com.yys.demo03接口中访问成员特点;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/10:53
 */
public class Imp implements IA {
    //重写了接口中抽像方法
    @Override
    public void method1() {
        System.out.println("实现类重写了接口中抽象方法");
    }

    //重写了接口中的默认方法
    @Override
    public void method2(){
        System.out.println("实现类重写了接口中的默认方法");
    }
}
