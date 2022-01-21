package com.yys01;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/27/10:28
 */
public class Demo02UseMethod {
    public static void main(String[] args) {

        System.out.println("游戏开始了..");
        System.out.println("看到了一个怪物...血牙野猪...");
        //调用方法发射炮弹
        fire();

        System.out.println("...血牙野猪被打倒...");

        System.out.println("...走啊走啊走啊走...");
        System.out.println("看到了一个怪物...黄金虎鲨...");
        fire();

        System.out.println("...黄金虎鲨被打倒...");

        System.out.println("游戏结束...");
    }
    public static void fire(){
        //发射炮弹
        System.out.println("准备发射5发炮弹");
        for (int i = 1; i <= 5;i++){
            System.out.println("发射第" + i + "发炮弹");
        }
        System.out.println("发射5发炮弹结束");
        return;//如果返回值是void类型,建议省略不写
    }
}
