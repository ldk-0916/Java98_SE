package com.yys.demo20_Semaphore;

import java.util.concurrent.Semaphore;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/11:12
 */
public class ClassRoom {
        Semaphore sp = new Semaphore(2);
        //获取许可证
        public void comeIn(){
            try {
                sp.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":获取许可证,可以进入班级...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //离开教室
            System.out.println(Thread.currentThread().getName()+":离开教室,释放许可证...");

            //释放许可证
            sp.release();
        }
}
