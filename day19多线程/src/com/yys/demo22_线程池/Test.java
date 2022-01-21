package com.yys.demo22_线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/14:03
 */
public class Test {
    public static void main(String[] args) {
        /*
            使用线程池中线程对象的步骤：
                1. 创建线程池对象。
                2. 创建Runnable接口子类对象。(task)
                3. 提交Runnable接口子类对象。(take task)
                4. 关闭线程池(一般不做)。

            线程池使用一:任务是通过实现Runnable的方式创建
              1.使用Executors工厂类中的静态方法来创建线程池:
                    public static ExecutorService newFixedThreadPool(int nThreads)：返回线程池对象,通过参数指定线程池中的线程数量
              2..提交并执行任务:
                    - public Future<?> submit(Runnable task):通过参数传入任务,获取线程池中的某一个线程对象，并执行任务
         */

        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(3);
        //创建Runnable接口子类对象
        MyRunnable mr = new MyRunnable();
        //分配任务
        es.submit(mr);
        es.submit(mr);
        es.submit(mr);

        //任务销毁(任务执行完毕销毁)
        //es.shutdown();//一般不做
    }
}
