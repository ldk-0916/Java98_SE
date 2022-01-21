package com.yys.demo14_创建线程的方式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/9:51
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        //放的是需要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程第"+ (i + 1) +"次循环");
        }
    }
}
