package com.yys.demo07_Buffer类;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/16:39
 */
public class Test6_OtherMethod {
    public static void main(String[] args) {
        /*
            - public int remaining()：获取position与limit之间的元素数。
            - public boolean isReadOnly()：获取当前缓冲区是否只读。
            - public boolean isDirect()：获取当前缓冲区是否为直接缓冲区。
            - public Buffer rewind()：重绕此缓冲区。
              - 将position位置设置为：0
              - 限制limit不变。
              - 丢弃标记。
            - public Buffer clear()：还原缓冲区的状态。
              - 将position设置为：0
              - 将限制limit设置为容量capacity；
              - 丢弃标记mark。
            - public Buffer flip()：缩小limit的范围。
              - 将limit设置为当前position位置；
              - 将当前position位置设置为0；
              - 丢弃标记
         */
        ByteBuffer b = ByteBuffer.allocate(10);
        b.put((byte)10);
        b.put((byte)20);
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());
        System.out.println(Arrays.toString(b.array()));
        System.out.println("----------------------------------------");
        //调用clear()方法
        //b.clear();
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());//位置为:0

        //调用flip
        b.flip();
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());//限制为:2
        System.out.println("==================================================");
        System.out.println("获取限制和容量之间的个数:"+b.remaining());
        System.out.println(b.isReadOnly());//false
        System.out.println(b.isDirect());//false
        System.out.println(b.rewind());//位置为0,limit2,容量:10


    }
}
