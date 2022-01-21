package com.yys.demo04继承后成员访问规则;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/13:47
 */
public class Zi extends Fu {
    //非私有成员变量
    String sex = "女";
    //非私有成员方法
    public void method2(){
        System.out.println("Zi method2");
    }
}
