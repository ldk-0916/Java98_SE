package com.yys;
import java.util.Scanner;
/**
 需求：
 小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，
 假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。

 奖励规则:
 95~100 山地自行车一辆 		包含95和100的	数学中表示方式: [95,100]  不包含95和100: (95,100)
 90~94  游乐场玩一次 		 包含90和94的
 80~89  变形金刚玩具一个     包含80和89的
 80以下  胖揍一顿 			 不包含80分的
 */
public class Demo06XiaoMing {
    public static void main(String[] args) {
        //创建键盘录入Scanner对象
        Scanner sc = new Scanner(System.in);
        //获取键盘录入的数字
        int score = sc.nextInt();
        if (score >= 95 && score <= 100){
            System.out.println("山地自行车一辆...");
        }else if (score >= 90 && score <= 94){
            System.out.println("游乐场一次...");
        }else if (score >= 80 && score <= 89){
            System.out.println("变形金刚玩具一个");
        }else {
            System.out.println("胖揍一顿");
        }
    }
}
