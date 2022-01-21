package com.yys.demo15_创建线程的方式二_实现方式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/10:39
 */
public class Test {
    public static void main(String[] args) {
        /*
        java中至少有2条线程:一条为主线程(main),另一条为垃圾回收线程
        java中线程采用的是抢占式调度
            实现方式:
                1.创建实现类实现Runnable接口
                2.在实现类中重写run方法,把线程需要执行的代码放入到run方法中
                3.创建实现类对象
                4.创建Thread线程对象,并传如Runnable接口的实现类对象
                5.调用start()方法来启动线程
         */

        //创建实现类对象
        MyRunnable mr1 = new MyRunnable();

        //创建Thread线程对象,并传如Runnable接口的实现类对象
        Thread th = new Thread(mr1);

        //调用start()方法来启动线程
        th.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 第" + (i + 1) + "次循环");
        }
    }
}
