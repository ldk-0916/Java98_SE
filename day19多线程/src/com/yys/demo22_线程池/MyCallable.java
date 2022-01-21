package com.yys.demo22_线程池;

import java.util.concurrent.Callable;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/14:15
 */
public class MyCallable implements Callable {
    @Override
    public String call() throws Exception {
        System.out.println("开始执行任务....");
        Thread.sleep(3000);
        System.out.println("任务执行结束...");
        return "张三被抓了";
    }
}
