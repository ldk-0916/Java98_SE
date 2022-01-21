package com.yys.demo08_递归累加和;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/15:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            计算1-n的累加和
            分析:
                        1 的累加和 = 1                      1的累加和=1
                        2 的累加和 = 1 + 2                  2的累加和=2+1的累加和 2 + getSum(2-1)
                        3 的累加和 = 1 + 2 + 3              3的累加和=3+2的累加和 3 + getSum(3-1)
                        4 的累加和 = 1 + 2 + 3 + 4          4的累加和=4+3的累加和 4 + getSum(4-1)
                        .....
                        n 的累加和                          n的累加和=n+(n-1)的累加和
         */
        System.out.println(getSum(5));
    }
    public static int getSum(int num){
        //出口
        if (num == 1){
            return 1;
        }
        return num + getSum(num - 1);
    }
}
