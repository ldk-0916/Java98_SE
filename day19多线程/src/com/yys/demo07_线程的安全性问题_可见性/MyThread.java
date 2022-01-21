package com.yys.demo07_线程的安全性问题_可见性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/9:25
 */
public class MyThread extends Thread {
    //共享变量(主/子线程共享)
    static boolean flag = false;

    @Override
    public void run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //修改flag的值
        flag = true;
        System.out.println("子线程把共享变量flag的值修改为true了");
    }
}
