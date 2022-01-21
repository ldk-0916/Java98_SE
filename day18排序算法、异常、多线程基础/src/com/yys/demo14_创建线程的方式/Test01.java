package com.yys.demo14_创建线程的方式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/9:47
 */
public class Test01 {
    public static void main(String[] args) {
        /*
            创建线程的方式:
                一.继承方式
                    1.创建子类继承Thread类
                    2.在子类中重写run方法,把线程需要执行的任务代码放在run方法中
                    3.创建子类对象
                    4.调用 start() 方法,启动线程
         */
        MyThread mt1 = new MyThread();
        //调用start方法启动线程,执行任务代码
        mt1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 第" + (i + 1) + "次循环");
        }
    }
}
