package com.yys.homework;

/**
 * 某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
 * 订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱(三元运算)
 */
public class Demo03Eat {
    public static void main(String[] args) {
        //不使用优惠时的总价
        double money1 = 24 + 8 + 3;
        //判断折后价格
        money1 = (money1 >= 30 ? money1 * 0.8 : money1 );
        //使用优惠价格结果
        double money2 = 16 + 8 + 3;
        //判断两种花费哪个更少
        double money = money1 > money2 ? money2 : money1;
        System.out.println(money);
    }
}
