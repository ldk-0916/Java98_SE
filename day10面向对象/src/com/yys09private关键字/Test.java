package com.yys09private关键字;

import java.security.PublicKey;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/30/9:18
 */
public class Test {
    public static void main(String[] args) {

        /*
            private:1.权限修饰符,可以修饰成员变量和成员方法
            2.被修饰的成员变量/方法只能在本类中访问
           private修饰成员变量格式: private 类型 变量名
           private修饰成员方法格式: private 返回值类型 方法名(){方法体}
         */
        //创建学生对象
        Student stu = new Student();
        //stu.name 无法访问
        //stu.study
        stu.show();
    }
}
