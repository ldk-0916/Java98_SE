package com.yys.demo14_使用注解;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:24
 */
public @interface MyAnnotation02 {
    //带属性的注解
    String name();
    int age();
    String[] arr();
}
