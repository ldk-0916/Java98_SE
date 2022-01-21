package com.yys.fy03;
import java.util.Random;
/**
 练习:
 产生10个66到178之间(包含66,包含178)的整数数字
 */
public class Demo03Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1;i <= 10; i++){
            int num = r.nextInt(113) + 66;
            System.out.println(num);
        }
    }
}
