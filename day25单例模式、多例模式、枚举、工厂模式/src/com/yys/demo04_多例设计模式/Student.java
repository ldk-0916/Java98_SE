package com.yys.demo04_多例设计模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/9:42
 */
public class Student {
    //1.私有化构造方法
    private Student() {
    }

    //2.在该类内部创建固定数量的该类对象
    //创建一个集合对象
    private static ArrayList<Student> list = new ArrayList<>();
    //产生5个对象
    static {
        for (int i = 0; i < 5; i++) {
            Student stu = new Student();
            list.add(stu);
        }
    }

    static int index = 0;
    //提供一个静态方法来随机获取该类对象
    public static Student getInstance(){
        //创建随机数Random对象
       /* Random r = new Random();
        //生成一个随机数,长度(0,集合长度)
        int index = r.nextInt(list.size());
        //格局随机数创建对象
        Student stu = list.get(index);*/
       if (list.size() > index){
           Student stu = list.get(index++);
           return stu;
       }
        return null;

    }
}
