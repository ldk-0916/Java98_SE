package com.yys.forxh;

/**
 *
 * 1.for循环格式:
 * 	for(初始化表达式1;布尔表达式2;步进表达式4){
 *         循环体3;
 *     }
 *
 * 2.执行流程:
 * 	1,2(循环条件: true),3,4 --> 2(循环条件: true),3,4 --> ... -->
 *         直到布尔表达式2(循环条件: false),结束循环,执行循环后面的其它语句
 *
 需求:
 在控制台输出5次HelloWorld
 */
public class Demo01ForHelloWorld {
    public static void main(String[] args) {
     /*   System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");*/

        //使用for循环
        //count:1,2,3,4,5
        /*
            int count = 1(第1步)
            count <= 5 (第2步)
            System.out.println("HelloWorld");(第3步)
            count++ (第4步)
         */
    /*    for(int count = 1; count <= 5 ; count++){
            System.out.println("HelloWorld");//循环体:3
        }*/

        for (int time = 0;time < 5; time++){
            System.out.println("HelloWorld"+time);
        }
    }

}
