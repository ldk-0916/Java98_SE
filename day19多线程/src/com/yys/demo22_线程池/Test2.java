package com.yys.demo22_线程池;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/14:18
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(2);

        //创建实现类对象
        MyCallable mc = new MyCallable();

        es.submit(mc);
        es.submit(mc);

        //获取线程池中的某一个对象
        Future<String> sb = es.submit(mc);
        System.out.println(sb.get());
        //关闭线程池(一般不关)
        es.shutdown();
    }
}
