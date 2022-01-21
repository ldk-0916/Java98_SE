package com.yys.demo09_递归的阶乘;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/10/9:05
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求:使用递归计算n的阶乘
            分析:所有小于或等于该数的正整数的积

            递归求阶乘:
                规律:
                    1! = 1                                      1的阶乘 : 1
                    2! = 2 * 1                                  2的阶乘 : 2 * 1的阶乘
                    3! = 3 * 2 * 1                              3的阶乘 : 3 * 2的阶乘
                    4! = 4 * 3 * 2 * 1                          4的阶乘 : 4 * 3的阶乘
                    5! = 5 * 4 * 3 * 2 * 1                      5的阶乘 : 5 * 4的阶乘
                    ....
                    num! = num * (num-1) * (num-2) *...* 1      num的阶乘 : num * num-1的阶乘
         */
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        //判断
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
