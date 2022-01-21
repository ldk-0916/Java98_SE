package com.yys.demo13_自定义异常;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/16:13
 */
//编译时异常
public class MyException1 extends Exception {
    public MyException1() {
    }

    public MyException1(String message) {
        super(message);
    }
}
