package com.yys.demo20_Semaphore;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/11:12
 */
public class Test {
    public static void main(String[] args) {
        /*
            Semaphore:
                概述:控制线程的并发数量
                 api:
                    public Semaphore(int permits)   permits 表示许可线程的数量
                    public void acquire()     	表示获取许可
                    public void release()		表示释放许可
            示例:5名同学进入教室,每次进去两人
         */
        //创建对象
        ClassRoom cr = new ClassRoom();
        //创建启动线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        },"张三").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        },"李四").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        },"王五").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        },"赵六").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                cr.comeIn();
            }
        },"罗翔").start();
    }
}
