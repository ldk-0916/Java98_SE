package com.yys.demo08_Date类;

import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/15:52
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            public long getTime() 获取当前日期对象距离标准基准时间的毫秒值。
            public void setTime(long time) 设置当前日期对象距离标准基准时间的毫秒值.也就意味着改变了当前日期对象
            public boolean after(Date when) 测试此日期是否在指定日期之后。
            public boolean before(Date when) 测试此日期是否在指定日期之前。
         */
        //创建当前系统时间对应的日期对象
        Date date1 = new Date();
        System.out.println(date1);//Mon Oct 18 15:53:27 CST 2021

        //创建以标准基准时间为基准,指定偏移1000毫秒
        Date date2 = new Date(1000);
        System.out.println(date2);

        //获取当前日期对象距离标准基准时间的毫秒数
       /* long time = date1.getTime();
        System.out.println(time);*/
        System.out.println(date1.getTime());//1634543784615毫秒
        System.out.println(date2.getTime());//1000

        //设置当前日期对象距离标准基准时间的毫秒值.也就意味着改变了当前日期对象;设置为2000毫秒
        date1.setTime(2000);
        System.out.println(date1);


        //after:测试此日期是否在指定日期之后。before:测试此日期是否在指定日期之前。
        //创建对象当前系统时间对应的日期对象
        Date date3 = new Date();
        System.out.println("date3表示的日期是否在date1之前:"+date3.before(date1));//false
        System.out.println("date3表示的日期是否在date1之后:"+date3.after(date1));//true
    }
}
