package com.yys;
import java.util.Scanner;
/**
 * 需求：
 *     一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，身高需要使用键盘录入
 *     请用程序实现获取这三个和尚的最高身高。
 */
public class Demo03Scanner {
    public static void main(String[] args){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //键盘在控制台输入身高
        System.out.println("请输入第一个和尚的身高:");
        int h1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高:");
        int h2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高:");
        int h3 = sc.nextInt();
        //两两比较,比较最大值(三元运算)
        int max1 = h1 > h2 ? h1 : h2;
        //拿上面的最大值和h3进行比较
        int max2 = max1 > h3 ? max1 : h3;
        System.out.println("三个和尚中最高的是:"+max2);
    }
}
