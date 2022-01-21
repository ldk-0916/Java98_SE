package com.yys.demo07_Buffer类;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/15:45
 */
public class Test3_limit {
    public static void main(String[] args) {
        /*
            限制limit:
                概念:第一个不应该读取或写入元素的index索引,缓冲区的限制(limit)不能为负，并且不能大于容量。
                方法:
                    public int limit()：获取此缓冲区的限制。
                    public Buffer limit(int newLimit)：设置此缓冲区的限制。
         */
        //创建字节数组对象
        ByteBuffer b = ByteBuffer.allocate(10);
        //容量为:10,限制为10
        System.out.println(b);
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit());

        //设置次缓冲区的数组限制
        b.limit(6);
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit());//容量:10,限制6
        b.put((byte)10);
        b.put((byte)10);
        b.put((byte)10);
        b.put((byte)10);
        b.put((byte)10);
        b.put((byte)10);
        System.out.println(Arrays.toString(b.array()));
        //b.put((byte)20);
        //System.out.println(Arrays.toString(b.array()));//缓冲区溢出异常BufferOverflowException
    }
}
