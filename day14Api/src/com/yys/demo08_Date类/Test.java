package com.yys.demo08_Date类;

import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/15:37
 */
public class Test {
    public static void main(String[] args) {
        /*
            Date类概述:表示一个日期和时间，内部精确到毫秒
            Date类中的构造方法:
                public Date():创建当前系统时间对应的日期对象
                public Date(Long date):创建以标准基准时间为基准 指定偏移毫秒数 对应的时间日期对象
                标准基准时间:世界协调时间/格林尼治时间
                    0时区:1970年1月1日00:00:00 GMT
                    东8区:1970年1月1日08:00:00 CST
         */
        //创建当前系统时间对应的日期对象
        Date date1 = new Date();
        System.out.println(date1);

        //创建以标准基准时间为基准,指定偏移1000毫秒
        Date date2 = new Date(1000);
        System.out.println(date2);

        //创建日期对象,表示1970年1月1日07:59:59
        Date date3 = new Date(-1000);
        System.out.println(date3);
    }
}
