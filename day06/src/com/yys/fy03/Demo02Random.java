package com.yys.fy03;
import java.util.Random;

/**
 * 1.产生10个0到100之间(包含0,但是不包含100)的整数数字[0,100)
 * 2.产生10个1到100之间(包含1,包含100)的整数数字[]
 *
 * Random中产生随机整数数字:
 * 			r.nextInt(): 产生一个int范围内(正负21亿)的随机数字
 * 			r.nextInt(int类型整数数字n): 产生一个0到n之间的随机数字(包含0,但是不包含n)
 * 				其中: 圆括号()中的int类型整数数字n表示产生随机数字的上限范围
 */
public class Demo02Random {
    public static void main(String[] args) {
        //创建Random对象
        Random r = new Random();
        for (int i = 0;i < 10; i++){
           int num = r.nextInt(100);
            System.out.println(num);
        }
        System.out.println("===================================");

        // 2.产生10个1到100之间(包含1,包含100)的整数数字[1,100]
        for (int j = 0; j < 10; j++){//产生10个数
            int num1 = r.nextInt(100) + 1;
            System.out.println(num1);
        }
        System.out.println("-------------------------------------");
        //产生2个1到5之间(包含1,包含5)的整数数字
        for (int i = 0; i < 2; i++){
            int num2 = r.nextInt(5) + 1;
            System.out.println(num2);
        }
    }
}
