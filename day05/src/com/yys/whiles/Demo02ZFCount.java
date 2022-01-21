package com.yys.whiles;

/**
 需求：
 世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 折纸(折叠后的厚度是原有厚度的2倍,而不是平方的关系):
 原来: 0.1
 第一次: 0.2
 第二次: 0.4
 第三次: 0.8
 第四次: 1.6
 ...
 */
public class Demo02ZFCount {
    public static void main(String[] args) {
        //定义两个变量
        double zf = 8844430;//zf高度
        double page = 0.1;//纸的厚度
        //定义一个折叠次数统计
        int count = 0 ;
        while (page < zf){
            page = page * 2;
            count ++;
            System.out.println(page);
        }
        System.out.println("折叠次数:"+count);//27

    }
}
