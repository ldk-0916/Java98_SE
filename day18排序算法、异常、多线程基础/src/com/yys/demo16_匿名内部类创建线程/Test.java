package com.yys.demo16_匿名内部类创建线程;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/10:51
 */
public class Test {
    /*
        匿名内部类方式创建线程:
            1.创建Runable匿名内部类
            2.在匿名内部类中重写run方法,把需要执行的代码放入到run方法中
            3.创建Thread线程对象,并把Runnable匿名内部类对象放进去
            4.调用start()方法启动线程
         注意:
            1.主线程一定会等到子线程执行完毕,才会结束主线程
            2.子线程任务代码执行完毕就会销毁
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程 第" + (i + 1) + "次循环");
        }

        //创建线程对象,并把匿名内部类放进去
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                //子线程
                for (int j = 0; j < 100; j++) {
                    System.out.println("子线程.... 第" + (j + 1) + "次循环");
                }
            }
        });
        //启动线程
        th.start();
    }
}
