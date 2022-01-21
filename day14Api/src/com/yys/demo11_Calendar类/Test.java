package com.yys.demo11_Calendar类;

import java.util.Calendar;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/9:26
 */
public class Test {
    public static void main(String[] args) {
        /*
            Calender类:
                概述:表示一个"日历类",可以进行日期运算,他是一个抽象类,不能创建对象,可以用它的子类java.util.GregorianCalendar类
                有两种方式可以获取GregorianCalendar对象
                1.直接获取GregorianCalendar对象
                2.通过Calendar静态方法getInstance()方法获取当前日期对象
             注意:
              日历对应的是:0-11
              中国人:一个星期的第一天为星期一,外国人:一个星期的第一天为星期天
         */
        //创建当前日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        /*
            java.util.GregorianCalendar[time=1634607118713,areFieldsSet=true,areAllFieldsSet=true,
            lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,
            useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
            ERA=1,YEAR=2021,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=19,DAY_OF_YEAR=292,
            DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=31,SECOND=58,MILLISECOND=713,
            ZONE_OFFSET=28800000,DST_OFFSET=0]
         */
    }
}
