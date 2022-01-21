package com.yys.forxh;

import java.util.Scanner;

/**
 需求:
 键盘录入一个三位数字,输出该数字是否是水仙花数字?

 解释：什么是水仙花数？
 水仙花数，指的是一个三位数[100,999]，个位、十位、百位的数字立方和等于原数
 例如 153 3*3*3 + 5*5*5 + 1*1*1 = 27 + 125 + 1 = 153
 */
public class Demo05ISSXH {
    public static void main(String[] args) {
        //1.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //录入一个三位数的整数,用num来表示这个三位数
        System.out.println("请输入一个三位数:");
        int num = sc.nextInt();
        //使用if判断该数字是否是水仙花数
        if (num >= 100 && num <= 999){
            //计算它的个 十 百位数,三个变量存到int接收
            int ge = num % 10;//各位
            int shi = num/10%10;//十位
            int bai = num/100%10;//百位

            //计算个十百位数的立方和
            int sum = ge * ge * ge + shi * shi * shi + bai * bai * bai;

            //拿到这个数的和和number进行比较,如果相同,num是一个水仙花数
            if (sum == num){
                System.out.println(num+"是一个水仙花数");
            }else{
                System.out.println(num+"不是一个水仙花数");
            }
        }else {
            System.out.println("你输入的不是一个三位数");
        }
    }
}
