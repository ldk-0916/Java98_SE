package com.yys.demo06_工厂模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/11:12
 */
public class CarFactory {

    /**
     * 创造汽车的工厂类
     * 汽车品牌
     * @return
     */
    public static Car creatCar(String carType){
        if (carType.equals("Ferrari")){
            return new Ferrari();
        }else if (carType.equals("Benz")){
            return new Benz();
        }else{
            return null;
        }
    }
}
