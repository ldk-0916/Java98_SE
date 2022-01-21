package com.yys02;

/**
 参数传递:
     可以理解当我们要调用一个方法时，我们会把指定的数值，传递给方法中的参数(定义方法时()中定义的变量)，
     这样方法中的参数就拥有了这个指定的值，可以使用该值，在方法中运算了。这种传递方式，我们称为参数传递。

 注意:
 2.变量的作用范围:
 方法内部定义的变量只在所定义的方法内有效(可以使用),出了方法的作用范围,就不能使用了
 局部变量: 方法内部定义的变量或者方法定义时()中定义的变量

 */
public class Demo01Pass {
    public static void main(String[] args) {
        //method(10,20);
        int a = 10,b = 20;
        method(a,b);
        //System.out.println(s);//局部变量只能用在自己方法内
    }
    public static void method(int x,int y){
        int s = 10;//局部变量
        int sum = x + y;
        System.out.println(sum);
    }
}
