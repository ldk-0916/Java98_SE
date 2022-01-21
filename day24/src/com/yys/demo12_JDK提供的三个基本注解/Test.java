package com.yys.demo12_JDK提供的三个基本注解;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/15:06
 */
public class Test {
    public static void main(String[] args) {
        /*
            JDK提供的三个基本的注解:
                	@Override:描述方法的重写.
                    @SuppressWarnings:压制\忽略警告.
                    @Deprecated:标记过时
         */
        @SuppressWarnings("all")
        int s;
    }
    @Deprecated
    public static void method1(){
        System.out.println("张三...");
    }

    public static void method2(){
        System.out.println("李四...");
    }
}
