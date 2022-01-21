package com.yys.demo13_序列化集合;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/11/15:55
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
            需求:
                1. 将存有多个自定义对象的集合序列化操作，保存到`list.txt`文件中。
                2. 反序列化`list.txt` ，并遍历集合，打印对象信息。
            分析:
                1. 把若干学生对象 ，保存到集合中。
                2. 把集合序列化。
                3. 反序列化读取时，只需要读取一次，转换为集合类型。
                4. 遍历集合，可以打印所有的学生信息
         */
        method();
        //创建反序列化对象向
        FileInputStream fis = new FileInputStream("File类_流\\aaa\\ddd\\list.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //读取对象
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        //关闭流
        ois.close();
        //遍历
        for (Student stu : list) {
            System.out.println(stu);
        }
    }
    public static void method() throws IOException {
        //创建学生对象
        Student stu1 = new Student("张三1",18);
        Student stu2 = new Student("张三2",19);
        Student stu3 = new Student("张三3",20);
        Student stu4 = new Student("张三4",22);

        //添加到集合当中
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        //序列化
        FileOutputStream fos = new FileOutputStream("File类_流\\aaa\\ddd\\list.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //写数据
        oos.writeObject(list);
        //关闭流
        oos.close();

    }
}
