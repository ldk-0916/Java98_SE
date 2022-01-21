package com.yys.fy02;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/24/14:02
 */
public class Demo03ForClock {
    public static void main(String[] args) {
        for (int s = 1; s <= 12; s++){//外循环控制小时,内循环控制分钟
            for (int m = 0; m < 60; m++){
                System.out.println(s + "点:" + m + "分");
            }
        }
    }
}
