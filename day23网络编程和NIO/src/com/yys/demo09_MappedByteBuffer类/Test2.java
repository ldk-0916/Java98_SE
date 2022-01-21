package com.yys.demo09_MappedByteBuffer类;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/10:47
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
             MappedByteBuffer类:
           概述:MappedByteBuffer类是ByteBuffer的抽象子类
           作用:他可以将文件直接映射到内存,把硬盘中的中的读写变成内存中的读写,所以可以提高大文件的读写效率。
           可以调用FileChannel的map()方法获取一个MappedByteBuffer，map()方法的原型：
        ​   MappedByteBuffer map(MapMode mode, long position, long size);
    ​		说明：将节点中从position开始的size个字节映射到返回的MappedByteBuffer中。

            map()方法的第一个参数mode：映射的三种模式，在这三种模式下得到的将是三种不同的MappedByteBuffer：
            三种模式都是Channel的内部类MapMode中定义的静态常量，这里以FileChannel举例
             model:
                FileChannel.MapMode.READ_ONLY：得到的镜像只能读不能写(只读)
                FileChannel.MapMode.READ_WRITE: 得到的镜像可读可写
                FileChannel.MapMode.READ_PRIVATE: 得到一个私有的镜像

                为什么使用RandomAccessFile？
                1). 使用InputStream获得的Channel可以映射，使用map时只能指定为READ_ONLY模式，不能指定为READ_WRITE和PRIVATE，否则会抛出运行时异常！

                2). 使用OutputStream得到的Channel不可以映射！并且OutputStream的Channel也只能write不能read！

                3). 只有RandomAccessFile获取的Channel才能开启任意的这三种模式！
         */
        //创建RandomAccessFile对象
        long starts = System.currentTimeMillis();
        RandomAccessFile r1 = new RandomAccessFile("D:\\java风云教育\\java95.zip","r");
        RandomAccessFile r2 = new RandomAccessFile("D:\\java风云教育\\Java95Copy.zip","rw");
        //获取channel
        FileChannel fc1 = r1.getChannel();
        FileChannel fc2 = r2.getChannel();
        //获取数据文件大小
        long size = fc1.size();
        //循环复制,总大小size
        //假设每一次复制字节大小为:everySize = 1024MB
        long everySize = 1024 * 1024 * 1024;
        //总共需要复制几次
        long count = size % everySize == 0 ? size / everySize : size / everySize + 1;
        //循环复制
        for (int i = 0; i < count; i++) {
            //每一次复制的起始字节位置
            long start = i * everySize;
            //每一次复制多少字节
            long totalSize = size - start > everySize ? everySize : size - start;
            //使用channel中的map方法获取MappedByteBuffer对象
            MappedByteBuffer mb1 = fc1.map(FileChannel.MapMode.READ_ONLY, start, totalSize);
            MappedByteBuffer mb2 = fc2.map(FileChannel.MapMode.READ_WRITE, start, totalSize);
            for (int j = 0; j < totalSize; j++) {
                byte b = mb1.get();
                mb2.put(b);
            }

        }
        long end = System.currentTimeMillis();
        System.out.println((end - starts)/1000);
        //释放资源
            fc2.close();
            fc1.close();
            r2.close();
            r1.close();
    }
}
