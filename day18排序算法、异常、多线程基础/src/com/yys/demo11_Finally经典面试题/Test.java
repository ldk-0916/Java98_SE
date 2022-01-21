package com.yys.demo11_Finally经典面试题;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/14:10
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(method1());//10(X)  200
        System.out.println(method2());//100(√)

    }

    private static int method2() {
        int num = 10;
        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException e){
            //catch在这里:1.首先记录要返回的值,然后执行finally; 2.最后把记录的返回值返回
            num = 100;
            return num;//记录要返回的值是:100
        }finally{
            num = 200;
            System.out.println(num);
        }
        return num;
    }

    /**
     * method1()就是按照正常的执行顺序,从上到下
     * @return
     */
    public static int method1(){
        int num = 10;
        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException e){
            num = 100;
            return num;
        }finally {
            num = 200;
            return num;
        }

    }
}
