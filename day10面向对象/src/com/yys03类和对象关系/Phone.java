package com.yys03类和对象关系;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/29/10:37
 */
public class Phone {
    //属性
    String brand;//品牌
    double price;//价格

    //行为
    public void call(String phoneNum){
        System.out.println("正在给" + phoneNum + "打电话...");
    }

    public void sendMessage(String phoneNum,String message){
        System.out.println("正在给" + phoneNum + "发信息,内容是:" + message);
    }

    //为了演示有参数有返回值的方法调用
    public String show(String str){
        System.out.println("有参数有返回值的方法:" + str);
        return "1";
    }
}
