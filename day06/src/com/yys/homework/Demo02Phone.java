package com.yys.homework;

/**
 *李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，
 * 把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。
 */
public class Demo02Phone {
    public static void main(String[] args) {
         int money1 = 7988 - 1500;
         double money2 = 7988 * 0.8;
         if (money1 > money2){
             System.out.println("以旧换新更划算...");
         }else if (money1 < money2){
             System.out.println("二手市场更划算...");
         }else{
             System.out.println("两个价格都一样...");
         }
    }
}
