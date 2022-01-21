package com.yys.demo13_AtomicInteger类;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/14:07
 */
public class MyThread extends Thread {
    //共享变量
    //static int a = 0;
    static AtomicInteger a = new AtomicInteger(0);//a表示整数0
    @Override
    public void run(){
        //线程任务
        for (int i = 0; i < 10000; i++) {
            //a++;
            a.getAndIncrement();//相当于a++
        }
        System.out.println("子线程执行完毕...");
    }
}
