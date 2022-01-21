package com.yys.demo12_ObjectOutputStream类;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/15:30
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            序列化ObjectOutputStream类:
                概述:将Java对象的原始数据类型写出到文件,实现对象的持久存储。
                构造方法:`public ObjectOutputStream(OutputStream out) ： 创建一个指定OutputStream的ObjectOutputStream。

             序列化注意事项:
                1.该类必须实现Serializable接口, Serializable:是一个接口的标记
                2.该类所有的属性必须是可序列化的
                3.如果有一个属性不需要序列化,必须注明是瞬态的,使用transient关键字修饰
         */
        //把Student对象写出到指定文件
        //创建对象
        Student stu = new Student("张三",18);

        //创建序列化流对象
        FileOutputStream fos = new FileOutputStream("File类_流\\aaa\\ddd\\a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //写出对象
        oos.writeObject(stu);
        oos.close();
    }
}
