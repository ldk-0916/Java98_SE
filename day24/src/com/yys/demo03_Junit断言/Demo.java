package com.yys.demo03_Junit断言;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/9:34
 */
public class Demo {
    /*
        断言：预先判断某个条件一定成立，如果条件不成立，则直接报错。 使用Assert类中的assertEquals()方法
     */
    @Test
    public void show(){
        Assert.assertEquals(30,sum(10,20));
        System.out.println(sum(10,20));
    }

    public int sum(int num1,int num2){
        return num1 + num2;
    }
}
