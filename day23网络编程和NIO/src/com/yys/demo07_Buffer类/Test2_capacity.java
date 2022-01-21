package com.yys.demo07_Buffer类;

import java.nio.ByteBuffer;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/15:38
 */
public class Test2_capacity{
    public static void main(String[] args) {
       /*
             Buffer的容量:Buffer所能够包含的元素的最大数量。定义了Buffer后，容量是不可变的。
             capacity:获取字节缓冲数组的容量
        */
        ByteBuffer bb = ByteBuffer.allocate(10);
        //获取bb的容量
        System.out.println("容器的容量:" + bb.capacity());
        byte[] bys = {65,66,67,68};
        ByteBuffer bb1 = ByteBuffer.wrap(bys);
        System.out.println("bb1的容量"+bb1.capacity());//4,容量可以变吗?不可变
    }
}
