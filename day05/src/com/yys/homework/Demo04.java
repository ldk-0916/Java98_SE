package com.yys.homework;

/**
 第四题:使用for循环打印九九乘法表
 */
public class Demo04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j < i +1;j++){
                System.out.print(j + "*" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }
}
