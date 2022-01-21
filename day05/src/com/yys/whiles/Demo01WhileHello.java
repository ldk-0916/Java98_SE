package com.yys.whiles;

/**
 需求:
 在控制台输出5次HelloWorld

 1.while循环格式:
 初始化表达式1;
 while(布尔表达式2) {
 循环体3;
 步进表达式4;
 }
 其它语句;

 2.执行流程:
 1,2(循环条件: true),3,4 --> 2(循环条件: true),3,4 --> ... -->
 直到布尔表达式2(循环条件: false),结束循环,执行循环后面的其它语句
 */
public class Demo01WhileHello {
    public static void main(String[] args) {
        //for
        /*for (int i = 1; i <= 5;i++){
            System.out.println("HelloWorld");
        }*/

        //使用while执行
        int j = 1;//初始化表达式的值(第一步)
        while (j <= 5){//第二步
            System.out.println("HelloWorld");//第三步
            j++;//第四步
        }
        System.out.println("end.......");
    }
}
