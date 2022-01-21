package com.yys07多个变量指向相同对象;

/**
 *多个变量指向同一个对象
 * 总结:引用类型传递的是地址值
 */
public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student stu1 = new Student();

        stu1.name = "罗翔";
        stu1.age = 18;
        System.out.println(stu1.name+":"+stu1.age);
        stu1.study();//访问成员方法
        System.out.println("============================================");
        //定义一个Student类型的变量,并把之前创建的stu1对象赋值给这个新的变量stu2
        Student stu2 = stu1;
        //在使用新的变量访问成员变量和方法
        System.out.println(stu2.name+":"+stu2.age);
        stu2.study();

    }
}
