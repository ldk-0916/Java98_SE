package com.yys.demo07this关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/15:08
 */
public class Student2 {
    public void method(){
        System.out.println("Student2 method");
    }
    public void show(){
        System.out.println("Student2 show");
        //调用method方法
        this.method();
        method();
    }
}
class Test01{
    public static void main(String[] args) {
        //this访问本类成员方法:this.成员方法名(实参); --->基本不用
        //创建Student2对象
        Student2 stu = new Student2();
        stu.show();
    }
}
