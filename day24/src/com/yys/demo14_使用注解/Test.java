package com.yys.demo14_使用注解;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:22
 */
@MyAnnotation01
@MyAnnotation02(name = "张三",age = 18,arr = {"刘思清","刘总"})
public class Test {
    public static void main(String[] args) {
        /*
            使用注解:
                如果一个注解中有属性,那么使用注解的时候一定要给注解属性赋值
                如果一个注解没用属性,那么就不需要给注解属性赋值,直接使用即可
            如何给注解属性赋值:
                    @注解名(属性名=值,属性名2=值2)
                注意:带属性的注解使用时一定要给属性赋值

         */
        @MyAnnotation01
        @MyAnnotation02(name = "张三",age = 18,arr = {"刘思清","刘总"})
        int num = 100;
    }
}
