package com.yys.demo15_装饰者模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/12/9:39
 */
//被装饰得类
public class LiuDeHua implements Start {
    @Override
    public void sing() {
        System.out.println("刘德华在唱恭喜发财...");
    }

    @Override
    public void dance() {
        System.out.println("刘德华再跳迈克尔太空舞步...");
    }
}
