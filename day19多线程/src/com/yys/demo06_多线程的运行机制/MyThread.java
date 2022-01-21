package com.yys.demo06_多线程的运行机制;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/9:11
 */
public class MyThread extends Thread  {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("张三:第" + i + "次循环");
        }
    }
}
