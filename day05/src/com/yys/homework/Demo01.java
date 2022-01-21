package com.yys.homework;

/**
 已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
 */
public class Demo01 {
    public static void main(String[] args) {
        //第一种
       /* for (int i = 1949; i <= 2019;i++){
            if ((2019 - i)%12 == 0){
                System.out.println(i);
            }
        }*/
       //第二种
       for (int i = 2019; i >= 1949 ;i = i-12){
           System.out.println(i);
       }
    }
}
