package com.homework;

/**
     数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，
     方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
 */
public class Demo03 {
    public static void main(String[] args) {
        double num = abs(-1);
        System.out.println(num);
    }
    public static double abs(double a){
        if (a < 0){
            //如果数字是负数则取反
            return -a;
        }else {
            //非负数,返回本身
            return a;
        }
    }
}
