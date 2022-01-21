package com.yys.demo01_正则表达式的概念及演示;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/25/9:09
 */
public class Test {
    public static void main(String[] args) {
        /*
            正则表达式:就是用来替换复杂的if结构判断,他是一个匹配规则

                先看一个不使用正则表达式验证的例子：下面的程序让用户输入一个QQ号码，我们要验证：
                    - QQ号码必须是5--15位长度
                    - 而且必须全部是数字
                    - 而且首位不能为0
         */
        System.out.println(checkedQQNum("01213i"));
        System.out.println(checkedQQNum("1213"));
        System.out.println(checkedQQNum("1213342"));
    }
    public static boolean checkedQQNum(String qq){
        if (qq == null){
            return false;
        }
    //    QQ号码必须是5--15位长度
        if (qq.length() < 5 || qq.length() > 15){
            return false;
        }

        //必须是数字
        for (int i = 0; i < qq.length(); i++) {
            //获取每个字符
            char c = qq.charAt(i);
            //判断
            if (c < '0' || c > '9'){
                return false;
            }
        }
        //而且首位不能为0
        if (qq.charAt(0) == '0'){
            return false;
        }
        return true;
    }
}
