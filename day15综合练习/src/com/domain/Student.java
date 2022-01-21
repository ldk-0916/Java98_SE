package com.domain;

import com.utils.Utils;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/20/9:31
 */
public class Student extends Person {
    {
        //构造代码块,每一次执行构造方法时都会执行一次,在构造方法之前执行
        Utils.sid++;
    }

    public Student() {
    }

    public Student(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学习java...";
    }
}
