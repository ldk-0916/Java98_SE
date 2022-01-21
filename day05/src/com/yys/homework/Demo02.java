package com.yys.homework;

/**
 有一个输出语句System.out.print("#")。使用这个语句，在控制台打印出一个四行五列的长方形，效果如下：
 */
public class Demo02 {
    public static void main(String[] args) {
       /* //外循环控制行数
        for (int i = 1;i <= 4;i++){
            //内循环控制列
            for (int j = 1;j <= 5;j++){
                System.out.print("#");
            }
            //负责换行
            System.out.println();
        }*/

       //第二种
        for (int i = 1;i <= 20;i++){
            if (i % 5 == 0){
                System.out.println("#");
            }else{
                System.out.print("#");
            }

        }

    }
}
