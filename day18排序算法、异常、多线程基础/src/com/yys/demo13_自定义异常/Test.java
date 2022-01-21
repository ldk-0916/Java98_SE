package com.yys.demo13_自定义异常;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/16:13
 */
public class Test {
    public static void main(String[] args) {
        /*
            异常类如何定义:
                1.自定义一个编译时异常:自定义类 并继承于`java.lang.Exception`。
                2.自定义一个运行时异常:自定义类 并继承于`java.lang.RuntimeException`。
         */
        //throw new MyException1("自定义异常1");
        throw new MyException2("自定义异常2");//编译期可以通过,运行时报错
    }
}
