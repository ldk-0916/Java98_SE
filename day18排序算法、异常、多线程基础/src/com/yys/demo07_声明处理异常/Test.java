package com.yys.demo07_声明处理异常;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/10:31
 */
public class Test {
    /*
        处理异常的目的:为了让程序走下去(继续执行下去)
        声明处理异常:
            使用throws关键字将问题标识出来, 表示当前方法不处理异常，而是提醒给调用者,
          让调用者来处理....最终会到虚拟机,虚拟机直接结束程序,打印异常信息。
        格式:
            修饰符 返回值类型 方法名() throws 异常类名1,异常类名2{,可以是一个,也可以是多个...
           }
           特点:声明处理异常,处理完后,如果程序运行的时候出现异常,程序依旧无法继续执行
           使用场景:声明处理异常,一般用于处理编译时异常

     */
    public static void main(String[] args) throws ParseException {
        //声明处理异常,一般用余处理编译时异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1997-07-01");
        System.out.println(date);//Tue Jul 01 00:00:00 CST 1997

       /* SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdf.parse("1997-7月-1日");
        System.out.println(date);//Tue Jul 01 00:00:00 CST 1997*/
    }
    //使用throws关键字将异常标识出来,表示当前方法不处理异常,调用者来处理
    public static void methods() throws ParseException {
        throw new ParseException("解析异常",1);
    }
    public static void method(int num) throws ParseException, FileNotFoundException {
        //产生一个异常(解析异常)
        if (num == 1){
            throw new ParseException("解析异常",1);
        }else{
            throw new FileNotFoundException("文件找不到异常");
        }
    }

}
