package com.yys.demo10_日期类练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/9:07
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        //需求:键盘输入一个字符串类型的时间，打印你来到世界多少天?
        //1.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期,格式为yyyy-MM-dd:");
        String str = sc.next();

        //2.创建日期格式化对象,指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //3.把字符串类型的日期转换成Date类型的日期
        Date birthdayDate = sdf.parse(str);
        //4.创建当前日期对象
        Date date = new Date();
        //5.获取当前日期对象距离标准基准时间的毫秒值
        long time1 = date.getTime();
        //6.获取出生日期距离标准基准时间的毫秒值
        long time2 = birthdayDate.getTime();
        //7.计算他俩差
        System.out.println("你来到这个世界" + (time1 - time2) / 1000 / 60 / 60 / 24 + "天");
    }
}
