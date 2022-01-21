package com.yys.demo18引用类型使用小结.demo03接口作为方法参数和返回值;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/9:29
 */
public class Test {
    public static void main(String[] args) {
        //同抽象类....
    }
    //接口最为方法的参数
    public static void method(A a){
        a.show();

    }
    //接口最为方法的返回值
    public static A method2(){
        return new Imp();
    }
}
