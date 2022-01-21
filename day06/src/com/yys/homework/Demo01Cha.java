package com.yys.homework;

/**
 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。绿茶妹妹有24元钱，
 她攒了几天钱之后自己的钱正好是原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？(赋值运算)
 */
public class Demo01Cha {
    public static void main(String[] args) {
        int red = 21,green = 24;
        red = red * 2 + 3;
        green = green * 2;
        System.out.println(red == green);//false
    }
}
