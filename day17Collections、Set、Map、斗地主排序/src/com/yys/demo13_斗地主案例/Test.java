package com.yys.demo13_斗地主案例;

import java.util.*;

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
        //创建一个map集合,来存储54张扑克
        Map<Integer, String> map = new HashMap<>();

        //创建一个集合存储A-K的13张牌面值
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
        //创建集合用来存储4个花色
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♠","♦","♣");

        //定义一个变量,做标记,标记大小王,初始值为0
        int n = 0;
        //大王
        map.put(n++,"大王");

        //小王
        map.put(n++,"小王");


        //5.把花色和牌面值 循环嵌套
        for (String number : numbers) {
            for (String color : colors) {
                //创牌
                String pai = color + number;
                map.put(n++,pai);
            }
        }

        //5.洗牌
        //获取所有牌的标记
        Set<Integer> keys = map.keySet();
        //将牌的标记转换成ArrayList集合
        ArrayList<Integer> id = new ArrayList<>();
        id.addAll(keys);

        //打乱排序
        Collections.shuffle(id);

        //6.发牌
        //创建三个玩家,用来存储他们的牌;创建一个集合用来存底牌
        ArrayList<Integer> lsq = new ArrayList<>();
        ArrayList<Integer> zjy = new ArrayList<>();
        ArrayList<Integer> lds = new ArrayList<>();
        ArrayList<Integer> dp = new ArrayList<>();

        for (int i = 0; i < id.size(); i++) {
            //获取遍历出来的牌,进行分配
            Integer pais = id.get(i);
            if (i >= 51){
                dp.add(pais);
            }else if (i % 3 == 0){
                lsq.add(pais);
            }else if (i % 3 == 1){
                zjy.add(pais);
            }else if (i % 3 == 2){
                lds.add(pais);
            }
        }
        //排序
        Collections.sort(lsq);
        Collections.sort(zjy);
        Collections.sort(lds);
        Collections.sort(dp);

        //取牌进行遍历
        System.out.print("刘思清:");
        for (Integer p1 : lsq) {
            String s = map.get(p1);
            System.out.print(s+" ");
        }
        //同上

        //看牌

       /* System.out.println("张景尧:"+zjy);
        System.out.println("刘大山:"+lds);
        System.out.println("底牌:"+dp);*/

    }
}
