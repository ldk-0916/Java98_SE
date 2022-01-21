package com.yys.demo02匿名对象;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/10:53
 */
public class Test {
    public static void main(String[] args) {
        /*
            匿名对象:
                概述:没有名字的对象
                特点:匿名对象只能使用一次
                使用场景:当某个类的对象只需要使用一次的时候,就可以使用该类的匿名对象
                       比如: 方法的参数和返回值;
         */

        Student stu1 = new Student("张三",18);//有名字对象
        stu1.show();
        System.out.println("=====================================");

        //匿名对象
       new Student("罗翔",45).show();//没有名字的对象
        System.out.println("=================================");

        //调用method1方法
        Student stu2 = new Student("张三",20);
        method1(stu2);//有名字传参
        method1(new Student("王五",19));//匿名传参

        System.out.println("==================================");
        Student stu3 = method2();
        stu3.show();
    }

    public static void method1(Student stu){
        stu.show();
    }
    public static Student method2(){
        //Student stu  = new Student("赵四",24);
        //return stu;
        return new Student("赵四",24);
    }
}
