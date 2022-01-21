package com.yys.homework;

/**
 有一个输出语句System.out.print("▲")。使用这个语句，在控制台打印出一个五行的三角形，效果如下：
 */
public class Demo03 {
    public static void main(String[] args) {
        //外循环控制行,内循环控制列
        for (int i = 1;i <= 5;i++){
            for (int j = 1; j < i;j++){
                System.out.print("▲ ");
            }
            //换行
            System.out.println("▲");
        }
    }
}
