package com.yys.demo07_Buffer类;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/15:16
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            buffer类:
                 概述:Buffer是一个抽象类，它是对某种基本类型的数组进行了封装。
                 作用: 在NIO中，就是通过 Buffer 来读写数据的。所有的数据都是用Buffer来处理的，
                 它是NIO读写数据的中转池, 通常使用字节数组。
              ByteBuffer:
              put(byte b):向当前可用位置添加数据
              public ByteBuffer put(byte[] byteArray)：向当前可用位置添加一个byte[]数组
              public ByteBuffer put(byte[] byteArray,int offset,int len)：添加一个byte[]数组的一部分
         */
        //创建字节缓冲数组
        ByteBuffer b = ByteBuffer.allocate(10);//在堆中创建缓冲区
        //往当前字节缓冲区数组添加数据(添加的数据类型为byte类型)
        b.put((byte) 10);
        b.put((byte) 20);
        b.put((byte) 30);
        //把这个字节缓冲数组转换为byte数组,然后按指定格式打印
        System.out.println(b);//java.nio.HeapByteBuffer[pos=3 lim=10 cap=10]
        System.out.println(b.array());//[B@1540e19d
        System.out.println(Arrays.toString(b.array()));//[10, 20, 30, 0, 0, 0, 0, 0, 0, 0]

        byte[] arr = {1,2,3,4,20};
        b.put(arr);
        System.out.println(Arrays.toString(b.array()));//[10, 20, 30, 1, 2, 3, 4, 20, 0, 0]
        b.put(arr,2,1);
        System.out.println(Arrays.toString(b.array()));//[10, 20, 30, 1, 2, 3, 4, 20, 3, 0]
    }
}
