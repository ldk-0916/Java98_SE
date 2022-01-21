package com.yys.fy03;
import java.util.Random;
/**
 * 1.产生10个int范围内的整数数字
 *
 * Random中产生随机整数数字:
 * 			r.nextInt(): 产生一个int范围内(正负21亿)的随机数字
 * 			r.nextInt(int类型整数数字n): 产生一个0到n之间的随机数字(包含0,但是不包含n)
 * 				其中: 圆括号()中的int类型整数数字n表示产生随机数字的上限范围
 */
public class Demo01Random {
    public static void main(String[] args) {
        //创建Random对象
        Random r = new Random();
        int s = r.nextInt();
        System.out.println(s);
        System.out.println("===========分割线===============");
        for (int i = 0; i < 10;i++){
            //产生一个随机数:r.nextInt()
            int num = r.nextInt();
            System.out.println(num);
        }
    }
}
