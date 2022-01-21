package com.yys.forxh;

/**
 需求:
 求1-5之间的数据和，并把求和结果在控制台输出
 */
public class Demo03ForSum {
    public static void main(String[] args) {
        //定义一个初始化变量sum,用来求和
        /*
            第一次:sum = 0 , i = 1; ===>sum = sum + i = 0 + 1;
            第二次:sum = 1 , i = 2; ====>sum = sum + i = 1 + 2;
            同理....
         */
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            sum = sum + i;
        }
        System.out.println("1-5的数字之和:"+sum);
    }
}
