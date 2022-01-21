package com.yys.demo06_工厂模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/11:16
 */
public class Test {
    public static void main(String[] args) {
        //创建法拉利对象
        Ferrari fi = new Ferrari();
        //创建奔驰对象
        Benz bz = new Benz();
        fi.run();
        bz.run();

        System.out.println("-------------------------------------------------------");
        Car car1 = CarFactory.creatCar("Ferrari");
        Car car2 = CarFactory.creatCar("Benz");
        car1.run();
        car2.run();
    }
}
