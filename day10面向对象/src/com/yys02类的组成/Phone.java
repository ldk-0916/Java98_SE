package com.yys02类的组成;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/29/9:44
 */
public class Phone {
    /**
        属性(成员变量): 数据类型 变量名
     */
    String brand;//品牌
    String color;//颜色

    /**
     * 功能 : 1.打电话 2.发信息
     * 功能(成员方法):去掉static修饰
     */
    //打电话
    public void call(String phoneNumber){
        System.out.println("手机可以打电话...");
    }

    //发短信

    /**
     *
     * @param phoneNumber 电话号码
     * @param message   发送的信息内容
     */
    public void sendMessage(String phoneNumber,String message){
        System.out.println("正在给"+phoneNumber+"发信息,内容是:"+message);
    }
}
