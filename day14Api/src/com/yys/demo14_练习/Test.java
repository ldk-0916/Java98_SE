package com.yys.demo14_练习;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/11:20
 */
public class Test {
    public static void main(String[] args) {
        /*
            控制台输出1-10000,计算这段代码执行了多少毫秒

         */
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println((end-start));
    }
}
