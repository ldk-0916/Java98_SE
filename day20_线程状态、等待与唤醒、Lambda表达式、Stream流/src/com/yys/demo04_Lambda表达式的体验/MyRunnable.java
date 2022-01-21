package com.yys.demo04_Lambda表达式的体验;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/9:42
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现接口的方式,任务代码...");
    }
}
