package com.yys05成员变量默认值;

/**
 *成员变量和局部变量区别:
 *  1.成员变量定义在类中,局部变量定义在方法中
 *  2.成员变量有默认值,局部变量没有默认值,要使用,就要赋值
 */
public class Test {
    public static void main(String[] args) {
        int num;//局部变量:定义在方法中的
        //System.out.println(num);编译报错,局部变量使用一定要赋值,没有默认值;
        char c;
        //System.out.println(c);编译报错,局部变量使用一定要赋值,没有默认值;

        /*
            成员变量有默认值:
                引用类型:默认值为null
                整数类型:默认值是0
                小数类型:默认值是0.0
                字符类型:默认值是不可见的字符 '\u0000'
         */
        //创建Student对象
        Student stu = new Student();
        //访问成员变量
        System.out.println(stu.name);//默认值:null
        System.out.println(stu.age);//默认值:0
        System.out.println(stu.score);//默认值:0.0
        System.out.println(":"+stu.c+":");//默认值:空
    }
}
