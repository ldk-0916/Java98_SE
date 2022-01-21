package com.yys.demo10_volatile解决可见性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/10:42
 */
public class MyThread extends Thread {
    volatile static boolean flag = false;
    @Override
    public void run(){
        //暂停3秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //修改flag的值
        flag = true;
        System.out.println("子线程把flag的值修改为true了...");
    }
}
