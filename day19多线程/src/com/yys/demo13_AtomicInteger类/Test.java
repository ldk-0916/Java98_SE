package com.yys.demo13_AtomicInteger类;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/14:07
 */
public class Test {
    public static void main(String[] args) {
        /*
            AtomicInteger类:
                保证原子操作
                无论运行多少次,结果都是正确的..
         */
        //创建线程对象
        MyThread mt = new MyThread();
        mt.start();
        //主线程也自增
        for (int i = 0; i < 10000; i++) {
            //Mythread.a++;
            MyThread.a.getAndIncrement();//a++

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终:"+MyThread.a);//最终:20000
    }
}
