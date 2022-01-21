package com.yys.demo13_自定义注解语法;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:14
 */
public @interface MyAnnotation01 {
    //注解属性

    //基本类型
    byte b();
    int i();
    short s();
    boolean flag();
    //
    String str();
    //
    Class c();

    //注解类类型
    MyAnnotation mys();

    //枚举类类型
    Sex sex();

    //一维数组
    byte[] bys();


}
