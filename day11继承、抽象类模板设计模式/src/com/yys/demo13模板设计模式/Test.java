package com.yys.demo13模板设计模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/11:26
 */
public class Test {
    public static void main(String[] args) {
        //略...
        //创建对象
        NewDriver newDriver = new NewDriver();
        newDriver.driverCar();

        //创建老司机
        OldDriver od = new OldDriver();
        od.driverCar();
    }
}
