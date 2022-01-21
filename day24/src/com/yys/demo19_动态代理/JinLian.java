package com.yys.demo19_动态代理;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/9:12
 */
//被代理者
public class JinLian implements Happy {
    @Override
    public void happy() {
        System.out.println("金莲说:我来了...");
    }
}
