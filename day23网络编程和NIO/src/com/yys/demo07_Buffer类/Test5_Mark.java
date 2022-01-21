package com.yys.demo07_Buffer类;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/16:27
 */
public class Test5_Mark {
    public static void main(String[] args) {
        /*
            Mark:标记
                当调用缓冲区的reset()方法时，会将缓冲区的position位置重置为该索引。
            方法:
                public Buffer mark()：设置此缓冲区的标记为当前的position位置。
                public Buffer reset() : 将此缓冲区的位置重置为以前标记的位置。
         */
        //创建字节缓冲区对象
        ByteBuffer b = ByteBuffer.allocate(10);
        //添加数据
        b.put((byte) 10);
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());
        //mark标记
        b.mark();//标记当前位置为:1
        b.put((byte)20);
        b.put((byte)30);
        b.put((byte)40);
        b.put((byte)50);
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());//容量:10限制:10位置:5
        System.out.println(Arrays.toString(b.array()));
        //重置标记
        b.reset();//position位置为:1
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());//位置变成:1
        b.put((byte) 3);//把这个元素的位置放在了mark标记元素的后面了
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());
        System.out.println(Arrays.toString(b.array()));
    }
}
