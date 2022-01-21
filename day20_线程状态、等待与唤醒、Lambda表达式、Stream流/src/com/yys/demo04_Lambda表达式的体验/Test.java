package com.yys.demo04_Lambda表达式的体验;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/9:43
 */
public class Test {
    public static void main(String[] args) {
        /*
           实现Runnable接口的方式创建线程执行任务
                1.创建一个实现类,实现Runnable接口
                2.在实现类中,重写run()方法,把任务放入run()方法中
                3.创建实现类对象
                4.创建Thread线程对象,传入实现类对象
                5.使用线程对象调用start()方法,启动并执行线程

            匿名内部类方式
                1.创建Thread对象,传如Runnable接口的匿名内部类
                2.在匿名内部类中重写run方法,里面放入代码任务
                3.使用对象直接调用start()方法
         */
        //创建实现类对象
        MyRunnable mr = new MyRunnable();
        //创建Thread对象,传入实现类
        new Thread(mr).start();

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类开启线程...");
            }
        }).start();

        /*
            Lambda表示创建线程任务
             以上2中都是通过Runnable接口的实现类对象,来传入线程任务(面向对象编程思想)
             思考:是否可以不用Runnable接口的实现类对象来传入任务,而是直接把任务传给线程

         */
        //Lambda表达式(jdk8之后才有的新特性)
        new Thread(() ->{
            System.out.println("Lambda的方式创建线程...");
        }).start();

        new Thread(() -> System.out.println("Lambad的方式创建")).start();
    }
}
