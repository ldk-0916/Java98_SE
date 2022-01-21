package com.yys.demo01标准类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/10:46
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        Student stu1 = new Student();
        Student stu2 = new Student("张三",18);

        //调用方法
        stu1.show();//null,0
        stu2.show();//张三,18
    }
}
