package com.yys.forxh;

/**
 需求:
 求1-100之间的偶数和，并把求和结果在控制台输出
 */
public class Demo04ForSum100 {
    public static void main(String[] args) {
        int sum = 0;
     /*   for (int i = 2; i <= 100;i = i + 2){
            sum = sum + i;
        }
        System.out.println(sum);*/
     for (int i = 1;i <= 100; i++){
         if (i % 2 == 0){
             sum = sum + i;
         }
     }
        System.out.println(sum);
    }
}
