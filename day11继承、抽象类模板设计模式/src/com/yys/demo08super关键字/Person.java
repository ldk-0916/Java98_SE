package com.yys.demo08super关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/15:36
 */
public class Person {
    public void method(){
        System.out.println("Fu method");
    }

}
class Student extends Person{
    @Override
    public void method(){
        System.out.println("Zi method");
    }
    public void show(){
        //访问本类method方法
        method();
        //访问父类method方法
        super.method();
    }
}
class Test01{
    public static void main(String[] args) {
        /*
        访问父类成员方法:super.父类方法名(实参)
     */
        Student stu = new Student();
        stu.show();
    }
}
