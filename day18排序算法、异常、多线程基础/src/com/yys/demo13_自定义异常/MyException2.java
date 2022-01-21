package com.yys.demo13_自定义异常;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/16:14
 */
//运行时异常
public class MyException2 extends RuntimeException {
    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }
}
