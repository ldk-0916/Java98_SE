package com.yys.demo05_用户登录案例;

import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/16:10
 */
public class Test {
    public static void main(String[] args) {
        //已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
        String name = "User";
        String password = "123456";

        //进行判断 已知三次机会
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的用户名:");
            String uname = sc.next();
            System.out.println("请输入密码:");
            String pwd = sc.next();
            //判断
            if (uname.equals(name) && pwd.equals(password)){
                System.out.println("登陆成功..!");
                break;
            }else{
                System.out.println("登陆失败,您还剩"+ (3-i)+"次机会");
            }
        }

    }
}
