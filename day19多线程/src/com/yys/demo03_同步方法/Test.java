package com.yys.demo03_同步方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/15:15
 */
public class Test {
    public static void main(String[] args) {
        /*
            同步方法:
                使用synchronized修饰的方法,就叫做同步方法,保证A线程执行该方法的时候,其他都在外面等着

             格式:
                修饰符 synchronized 返回值类型 方法名(形参列表){

                }
                注意:
                非静态同步方法:锁对象是this
                静态方法,锁对象是该方法所在的类的字节码对象(类名.class)
         */
        //创建线程任务对象
        MyRunnable mr = new MyRunnable();

        //创建窗口
        Thread t1 = new Thread(mr,"窗口1");
        Thread t2 = new Thread(mr,"窗口2");
        Thread t3 = new Thread(mr,"窗口3");
        Thread t4 = new Thread(mr,"窗口4");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
