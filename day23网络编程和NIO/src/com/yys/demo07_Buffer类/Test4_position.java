package com.yys.demo07_Buffer类;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/15/15:55
 */
public class Test4_position {
    public static void main(String[] args) {
        /*
            位置position:当前写入的数据,不能小于0,并且不能大于"限制"
            方法:
                public int position()：获取当前可写入位置索引。
                public Buffer position(int p)：更改当前可写入位置索引。
         */
        ByteBuffer b = ByteBuffer.allocate(10);
        //限制:10,容量:10,位置:0
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());

        //添加数据
        b.put((byte)10);
        b.put((byte)10);
        b.put((byte)10);
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());
        System.out.println(Arrays.toString(b.array()));

        //修改位置为7
        b.position(7);
        b.put((byte)20);
        System.out.println("容量:"+b.capacity()+"限制:"+b.limit()+"位置:"+b.position());
        System.out.println(Arrays.toString(b.array()));
    }
}
