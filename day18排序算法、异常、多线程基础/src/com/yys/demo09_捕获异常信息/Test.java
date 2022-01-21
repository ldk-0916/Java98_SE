package com.yys.demo09_捕获异常信息;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/13:45
 */
public class Test {
    public static void main(String[] args) {
        /*
            Throwable获取异常信息的方法:
                - `public String getMessage()`:获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。)
                - `public String toString()`:获取异常的类型和异常描述信息(不用)。
                - `public void printStackTrace()`:打印异常的跟踪栈信息并输出到控制台。
         */
        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());//异常信息的描述
            System.out.println(e);//异常信息
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
