package com.yys.demo09_MappedByteBuffer类;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/16/9:42
 */
public class Test1 {
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
        long start = System.currentTimeMillis();
        //使用RandomAccessFile对象:r表示只读 rw:读写
        RandomAccessFile r1 = new RandomAccessFile("D:\\java风云教育\\java92期.zip","r");
        RandomAccessFile r2 = new RandomAccessFile("D:\\java风云教育\\javaCopy92期.zip","rw");

        //获取channel对象
        FileChannel fc1 = r1.getChannel();
        FileChannel fc2 = r2.getChannel();
        //获取文件字节大小
        long size = fc1.size();
        //使用channel中的map方法,来获取MappedByteBuffer对象
        MappedByteBuffer map1 = fc1.map(FileChannel.MapMode.READ_ONLY, 0, size);
        MappedByteBuffer map2 = fc2.map(FileChannel.MapMode.READ_WRITE, 0, size);

        //把map1中的数据复制到map2中
        for (int i = 0; i < size; i++) {
            //获取map1的字节
            byte b = map1.get();
            map2.put(b);
        }
        //关闭流
        fc2.close();
        fc1.close();
        r2.close();
        r1.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
