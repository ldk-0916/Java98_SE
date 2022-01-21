package com.yys.fy03;
import java.util.Random;
import java.util.Scanner;
/**
 1.需求：程序自动生成一个1-100之间(包含1,包含100)的数字，使用程序实现猜出这个数字是多少？

 2.效果：
 如果猜的数字比真实数字大，提示你猜的数据大了
 如果猜的数字比真实数字小，提示你猜的数据小了
 如果猜的数字与真实数字相等，提示恭喜你猜中了
 */
public class Demo04Csz {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();
        //产生一个int类型的随机数,
        int a = r.nextInt(100) + 1;
        //创建一个键盘录入对象
        Scanner sc = new Scanner(System.in);
        //要进行猜数字判断
        while (true){
            System.out.println("请输入一个你要猜测的数字(1-100)");
            int num = sc.nextInt();
            //进行判断
            if (num > a){
                System.out.println("你猜的数据大了");
            }else if (num < a){
                System.out.println("你猜的数据小了");
            }else {
                System.out.println("你猜对了");
                break;
            }
        }
    }
}
