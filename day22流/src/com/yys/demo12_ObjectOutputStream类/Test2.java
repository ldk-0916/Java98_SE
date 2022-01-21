package com.yys.demo12_ObjectOutputStream类;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/15:43
 */
public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //把a.txt反序列化出来
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\ddd\\a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //读数据
        Student stu = (Student) ois.readObject();
        System.out.println(stu);
        ois.close();
    }
}
