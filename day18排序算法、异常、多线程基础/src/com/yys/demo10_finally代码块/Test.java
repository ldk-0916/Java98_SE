package com.yys.demo10_finally代码块;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/13:53
 */
public class Test {
    public static void main(String[] args) {
        /*
            finally代码块
                概述:finally代码块中存放的代码一定会被执行的
                try{

                }catch(异常类型 变量名){
                    处理代码或者打印异常信息的
                }finally{
                    无论前面的代码是否出现异常,都会去执行这里的代码,一般是用来释放资源
                }

                执行步骤:
                1.首先执行try中的代码,如果try中代码出现异常,那么就执行catch()里面的代码,执行完之后会执行finally中的代码,然后程序继续往下执行
                2.如果try中没有出现异常,就不会执行catch中的代码,但是会执行finally中的代码....

         */
        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException e){
            System.out.println("catch 出现了异常");
            System.exit(0);
            //return;
        }finally{
            System.out.println("无论前面代码是否出现异常,都会执行");
        }

        System.out.println("-----------------------------------------");
        try {
            System.out.println(1 / 1);
        }catch (ArithmeticException e){
            System.out.println("catch 出现了异常");//不执行了
            System.exit(0);
        }finally{
            System.out.println("无论前面代码是否出现异常,都会执行");
        }

    }
}
