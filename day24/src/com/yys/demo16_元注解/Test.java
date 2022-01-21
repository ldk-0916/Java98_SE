package com.yys.demo16_元注解;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:50
 */
@MyAnnotation
public class Test {
   // @MyAnnotation//限制该注解只能在方法上和类上使用
    int num;

    @MyAnnotation
    public static void main(String[] args) {
        int num;
    }
}
