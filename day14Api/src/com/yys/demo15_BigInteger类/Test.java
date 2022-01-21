package com.yys.demo15_BigInteger类;

import java.math.BigInteger;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/13:38
 */
public class Test {
    public static void main(String[] args) {
        /*
            BigInteger:java.math.BigInteger 表示一个超大整数
            构造方法:
                public BigInteger(String value):
                成员方法:
                    ....略
         */
        //创建BigInteger对象
        BigInteger b1 = new BigInteger("23000000000000000000000000000000000000000010000000000000");
        BigInteger b2 = new BigInteger("21000000000000000000000000000000000000000000000000000010");

        //b1+b2 :add
        BigInteger result1 = b1.add(b2);
        System.out.println(result1);

        //b1-b2:subtract
        BigInteger result2 = b1.subtract(b2);
        System.out.println(result2);

        //b1*b2
        BigInteger result3 = b1.multiply(b2);
        System.out.println(result3);

        //b1/b2:divide
        BigInteger result4 = b1.divide(b2);
        System.out.println(result4);
    }
}
