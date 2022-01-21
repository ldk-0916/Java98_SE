package com.yys.demo20基本类型与字符串之间的转换;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/15:40
 */
public class Test {
    public static void main(String[] args) {
        /*
            基本类型与字符串之间的转换:
                基本类型--->字符串
                    方式一:直接在数字后面加空字符串("")
                    方式二:通过String类的一个静态方法valueOf()
                字符串--->基本类型
                除了Character类之外,其他所有的包装类都具有parseXxx静态方法可以将我们的字符串参数准换为对应的基本类型
                parseDouble();
                parseByte();
                parseShort();
                parseBoolean();
         */
        //基本类型转换成String类型
        String str1 = 100 + "";//str的字符串内容为:"100"
        String str2 = String.valueOf(100);

        //字符串转换成基本类型
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        System.out.println(num1+num2);//200
    }
}
