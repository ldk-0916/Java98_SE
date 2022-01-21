package com.yys.demo13_自定义异常;

import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/16:20
 */
public class Test_RegisterException {
    public static void main(String[] args) {
        /*
            要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册
         */
        String[] names = {"张三","李四","王五"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个用户名:");
        String name = sc.next();

        //遍历数组
        for (String s : names) {
            //判断输入的用户名和数组中的用户名是否相同
            if (name.equals(s)){
                //如果相同就抛出异常对象
                try {
                    throw new RegisterException("亲，该用户名已经被注册!");
                }catch (RegisterException e){
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }
        //如果不同
        System.out.println("您已注册成功");
    }
}
