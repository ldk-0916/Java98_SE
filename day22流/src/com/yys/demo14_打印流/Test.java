package com.yys.demo14_打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/12/9:13
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            打印流的使用:
                PrintStream类:是一个字节输出流
                特点:该类可以打印各种类型的数据的值,是一种便捷的输出方式
                PrintStream(String fileName)使用指定的文件名创建一个新的打印流。
                成员方法:
                    print(任意类型):不换行打印
                    println(任意类型):换行打印
         */
        //打印数据到b.txt文件中
        PrintStream ps = new PrintStream("File类_流\\aaa\\ddd\\b.txt");
        //打印数据 换行
        ps.println(97);
        ps.println('a');
        ps.println(1.11);
        ps.println("张三");
        ps.println(true);
        System.out.println("----------------------------------------------");

        //打印数据 不换行
        ps.print(1);
        ps.print('A');
        ps.print(3.14);
        ps.print("罗翔");
        ps.print(true);
        ps.close();

        //说明系统打印流对象,是关联到控制台的
        System.out.println("张三");//打印到控制台
        System.out.println(18);//打印到控制台

        System.out.println("-------------------------------------------");
        //改变系统打印流对象
        PrintStream ps1 = new PrintStream("File类_流\\aaa\\ddd\\c.txt");

        /*
            setOut():重新分配"标准"输出流
         */
        System.setOut(ps1);
        System.out.println("李四");
        System.out.println(24);
    }
}
