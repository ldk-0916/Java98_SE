package com.yys.demo04_同步方法锁对象;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/15:30
 */
public class Demo {
    //锁对象 this --这个对象
    public synchronized void method1(){
        System.out.println(Thread.currentThread().getName() + "打开厕所门...");
        System.out.println(Thread.currentThread().getName() + "关闭厕所门...");
        System.out.println(Thread.currentThread().getName() + "脱裤子...");
        System.out.println(Thread.currentThread().getName() + "坐马桶...");
        System.out.println(Thread.currentThread().getName() + "抽烟玩手机...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "打电话给刘思清让他送纸...");
        System.out.println("......");
        System.out.println(Thread.currentThread().getName() + "提裤子...");
        System.out.println(Thread.currentThread().getName() + "冲厕所...");
        System.out.println(Thread.currentThread().getName() + "打开厕所门,洗手,走人...");
    }

    //锁对象:Demo.class
    public static synchronized void method2(){
        System.out.println(Thread.currentThread().getName() + "打开厕所门...");
        System.out.println(Thread.currentThread().getName() + "关闭厕所门...");
        System.out.println(Thread.currentThread().getName() + "脱裤子...");
        System.out.println(Thread.currentThread().getName() + "坐马桶...");
        System.out.println(Thread.currentThread().getName() + "抽烟玩手机...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "打电话给刘思清让他送纸...");
        System.out.println("......");
        System.out.println(Thread.currentThread().getName() + "提裤子...");
        System.out.println(Thread.currentThread().getName() + "冲厕所...");
        System.out.println(Thread.currentThread().getName() + "打开厕所门,洗手,走人...");
    }
}
