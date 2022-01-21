package com.yys.demo18_代理模式;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/9:12
 */
//被代理者
public class JinLian implements Happy {
    @Override
    public void happy() {
        System.out.println("金莲说:大郎起来喝药了...");
    }
}
