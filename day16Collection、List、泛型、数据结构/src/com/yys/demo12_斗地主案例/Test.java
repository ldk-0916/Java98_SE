package com.yys.demo12_斗地主案例;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/22/14:02
 */
public class Test {
    public static void main(String[] args) {
        /*
            按照斗地主的规则，完成造牌洗牌发牌的动作。
            具体规则：使用54张牌打乱顺序,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
         */
        //1.造牌
        //创建一个pokerBox集合,来存储54张扑克
        ArrayList<String> pokerBox = new ArrayList<>();
        //创建一个集合存储A-K的13张牌面值
        ArrayList<String> number = new ArrayList<>();
        //创建集合用来存储4个花色
        ArrayList<String> colors = new ArrayList<>();

        //2.添加牌面值
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        for (int i = 2; i <= 10 ; i++) {
            //i是数字,要拼接成字符串
            number.add(i + "");
        }

        //3.添加花色
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");

        //4.添加大小王
        pokerBox.add("大王");
        pokerBox.add("小王");

        //5.把花色和牌面值放到pokerBox里面  循环嵌套
        for (String numbers : number) {
            for (String color:colors) {
                //把牌放到扑克盒里面(pokerBox)
                String pai = color + numbers;
                pokerBox.add(pai);
            }
        }

        //5.洗牌
        Collections.shuffle(pokerBox);

        //6.发牌
        //创建三个玩家,用来存储他们的牌;创建一个集合用来存底牌
        ArrayList<String> lsq = new ArrayList<>();
        ArrayList<String> zjy = new ArrayList<>();
        ArrayList<String> lds = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            //获取遍历出来的牌,进行分配
            String pai = pokerBox.get(i);
            if (i >= 51){
                dp.add(pai);
            }else if (i % 3 == 0){
                lsq.add(pai);
            }else if (i % 3 == 1){
                zjy.add(pai);
            }else if (i % 3 == 2){
                lds.add(pai);
            }
        }

        //看牌
        System.out.println("刘思清:"+lsq);
        System.out.println("张景尧:"+zjy);
        System.out.println("刘大山:"+lds);
        System.out.println("底牌:"+dp);

    }
}
