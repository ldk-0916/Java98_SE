package com.yys.demo04继承后成员访问规则;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/13:43
 */
public class Fu {
    //非私有成员变量
    int num;

    public Fu() {
    }

    public Fu(int num) {
        this.num = num;
    }

    //私有成员变量
    private String name;

    //私有成员方法
    private void method1(){
        System.out.println("Fu method1");
    }

    //非私有成员变量
    String sex = "男";
    //非私有成员方法
    public void method2(){
        System.out.println("Fu method2");
    }

}
