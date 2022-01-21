package com.yys01;

/**
 无返回值无参数方法的定义和调用
 无参数:
 目前没有参数,不需要写参数列表,但是必须保留小括号()
 无返回值:
 目前定义的方法没有返回值,返回值类型固定写为void
 方法内部没有数据返还给调用者,没有返回值,返回值类型固定写为void
 1.练习:
 定义方法method,方法内部输出一句话"我是一个方法"
 2.注意:
 (1)方法定义完毕后不调用不执行
 (2)调用格式:
 方法名称(...);
 (3)方法可以调用任意多次
 */
public class Demo03Method {
    public static void main(String[] args) {
        System.out.println("开始........");
        method();
        System.out.println("结束.............");
    }
    public static void method(){
        System.out.println("我是一个方法");
    }
}
