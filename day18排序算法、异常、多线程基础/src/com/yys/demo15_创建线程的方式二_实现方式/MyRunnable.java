package com.yys.demo15_创建线程的方式二_实现方式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/10:41
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        //线程要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("子实现类线程 第" + (i + 1) + "次循环");
        }
    }
}
